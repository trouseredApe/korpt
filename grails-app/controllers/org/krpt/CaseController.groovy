package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CaseController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Case.list(params), model:[incidentInstanceCount: Case.count()]
    }

    def show(Case incidentInstance) {
        respond incidentInstance
    }

    def create() {
        respond new Case(params)
    }

    @Transactional
    def save(Case incidentInstance) {
        if (incidentInstance == null) {
            notFound()
            return
        }

        if (incidentInstance.hasErrors()) {
            respond incidentInstance.errors, view:'create'
            return
        }

        incidentInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'incidentInstance.label', default: 'Incident'), incidentInstance.id])
                redirect incidentInstance
            }
            '*' { respond incidentInstance, [status: CREATED] }
        }
    }

    def edit(Case incidentInstance) {
        respond incidentInstance
    }

    @Transactional
    def update(Case incidentInstance) {
        if (incidentInstance == null) {
            notFound()
            return
        }

        if (incidentInstance.hasErrors()) {
            respond incidentInstance.errors, view:'edit'
            return
        }

        incidentInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Incident.label', default: 'Incident'), incidentInstance.id])
                redirect incidentInstance
            }
            '*'{ respond incidentInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Case incidentInstance) {

        if (incidentInstance == null) {
            notFound()
            return
        }

        incidentInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Incident.label', default: 'Incident'), incidentInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'incidentInstance.label', default: 'Incident'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
