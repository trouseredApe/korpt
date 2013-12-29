package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ExempleryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Exemplery.list(params), model:[exempleryInstanceCount: Exemplery.count()]
    }

    def show(Exemplery exempleryInstance) {
        respond exempleryInstance
    }

    def create() {
        respond new Exemplery(params)
    }

    @Transactional
    def save(Exemplery exempleryInstance) {
        if (exempleryInstance == null) {
            notFound()
            return
        }

        if (exempleryInstance.hasErrors()) {
            respond exempleryInstance.errors, view:'create'
            return
        }

        exempleryInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'exempleryInstance.label', default: 'Exemplery'), exempleryInstance.id])
                redirect exempleryInstance
            }
            '*' { respond exempleryInstance, [status: CREATED] }
        }
    }

    def edit(Exemplery exempleryInstance) {
        respond exempleryInstance
    }

    @Transactional
    def update(Exemplery exempleryInstance) {
        if (exempleryInstance == null) {
            notFound()
            return
        }

        if (exempleryInstance.hasErrors()) {
            respond exempleryInstance.errors, view:'edit'
            return
        }

        exempleryInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Exemplery.label', default: 'Exemplery'), exempleryInstance.id])
                redirect exempleryInstance
            }
            '*'{ respond exempleryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Exemplery exempleryInstance) {

        if (exempleryInstance == null) {
            notFound()
            return
        }

        exempleryInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Exemplery.label', default: 'Exemplery'), exempleryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'exempleryInstance.label', default: 'Exemplery'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
