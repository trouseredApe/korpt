package org.krpt



import grails.test.mixin.*
import spock.lang.*

@TestFor(AccusedController)
@Mock(Accused)
class AccusedControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.accusedInstanceList
            model.accusedInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.accusedInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def accused = new Accused()
            accused.validate()
            controller.save(accused)

        then:"The create view is rendered again with the correct model"
            model.accusedInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            accused = new Accused(params)

            controller.save(accused)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/accused/show/1'
            controller.flash.message != null
            Accused.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def accused = new Accused(params)
            controller.show(accused)

        then:"A model is populated containing the domain instance"
            model.accusedInstance == accused
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def accused = new Accused(params)
            controller.edit(accused)

        then:"A model is populated containing the domain instance"
            model.accusedInstance == accused
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/accused/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def accused = new Accused()
            accused.validate()
            controller.update(accused)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.accusedInstance == accused

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            accused = new Accused(params).save(flush: true)
            controller.update(accused)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/accused/show/$accused.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/accused/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def accused = new Accused(params).save(flush: true)

        then:"It exists"
            Accused.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(accused)

        then:"The instance is deleted"
            Accused.count() == 0
            response.redirectedUrl == '/accused/index'
            flash.message != null
    }
}
