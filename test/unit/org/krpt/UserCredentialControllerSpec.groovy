package org.krpt



import grails.test.mixin.*
import spock.lang.*

@TestFor(UserCredentialController)
@Mock(UserCredential)
class UserCredentialControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.userCredentialInstanceList
            model.userCredentialInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.userCredentialInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def userCredential = new UserCredential()
            userCredential.validate()
            controller.save(userCredential)

        then:"The create view is rendered again with the correct model"
            model.userCredentialInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            userCredential = new UserCredential(params)

            controller.save(userCredential)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/userCredential/show/1'
            controller.flash.message != null
            UserCredential.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def userCredential = new UserCredential(params)
            controller.show(userCredential)

        then:"A model is populated containing the domain instance"
            model.userCredentialInstance == userCredential
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def userCredential = new UserCredential(params)
            controller.edit(userCredential)

        then:"A model is populated containing the domain instance"
            model.userCredentialInstance == userCredential
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/userCredential/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def userCredential = new UserCredential()
            userCredential.validate()
            controller.update(userCredential)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.userCredentialInstance == userCredential

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            userCredential = new UserCredential(params).save(flush: true)
            controller.update(userCredential)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/userCredential/show/$userCredential.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/userCredential/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def userCredential = new UserCredential(params).save(flush: true)

        then:"It exists"
            UserCredential.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(userCredential)

        then:"The instance is deleted"
            UserCredential.count() == 0
            response.redirectedUrl == '/userCredential/index'
            flash.message != null
    }
}
