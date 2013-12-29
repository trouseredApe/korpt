package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EvidenceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Evidence.list(params), model:[evidenceInstanceCount: Evidence.count()]
    }

    def show(Evidence evidenceInstance) {
        respond evidenceInstance
    }

    def create() {
        respond new Evidence(params)
    }

    @Transactional
    def save(Evidence evidenceInstance) {
        if (evidenceInstance == null) {
            notFound()
            return
        }

        if (evidenceInstance.hasErrors()) {
            respond evidenceInstance.errors, view:'create'
            return
        }

        evidenceInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'evidenceInstance.label', default: 'Evidence'), evidenceInstance.id])
                redirect evidenceInstance
            }
            '*' { respond evidenceInstance, [status: CREATED] }
        }
    }

    def edit(Evidence evidenceInstance) {
        respond evidenceInstance
    }

    @Transactional
    def update(Evidence evidenceInstance) {
        if (evidenceInstance == null) {
            notFound()
            return
        }

        if (evidenceInstance.hasErrors()) {
            respond evidenceInstance.errors, view:'edit'
            return
        }

        evidenceInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Evidence.label', default: 'Evidence'), evidenceInstance.id])
                redirect evidenceInstance
            }
            '*'{ respond evidenceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Evidence evidenceInstance) {

        if (evidenceInstance == null) {
            notFound()
            return
        }

        evidenceInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Evidence.label', default: 'Evidence'), evidenceInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'evidenceInstance.label', default: 'Evidence'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
