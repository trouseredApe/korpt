package org.krpt



import grails.test.mixin.*
import spock.lang.*

@TestFor(ExempleryController)
@Mock(Exemplery)
class ExempleryControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.exempleryInstanceList
            model.exempleryInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.exempleryInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def exemplery = new Exemplery()
            exemplery.validate()
            controller.save(exemplery)

        then:"The create view is rendered again with the correct model"
            model.exempleryInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            exemplery = new Exemplery(params)

            controller.save(exemplery)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/exemplery/show/1'
            controller.flash.message != null
            Exemplery.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def exemplery = new Exemplery(params)
            controller.show(exemplery)

        then:"A model is populated containing the domain instance"
            model.exempleryInstance == exemplery
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def exemplery = new Exemplery(params)
            controller.edit(exemplery)

        then:"A model is populated containing the domain instance"
            model.exempleryInstance == exemplery
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/exemplery/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def exemplery = new Exemplery()
            exemplery.validate()
            controller.update(exemplery)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.exempleryInstance == exemplery

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            exemplery = new Exemplery(params).save(flush: true)
            controller.update(exemplery)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/exemplery/show/$exemplery.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/exemplery/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def exemplery = new Exemplery(params).save(flush: true)

        then:"It exists"
            Exemplery.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(exemplery)

        then:"The instance is deleted"
            Exemplery.count() == 0
            response.redirectedUrl == '/exemplery/index'
            flash.message != null
    }
}
