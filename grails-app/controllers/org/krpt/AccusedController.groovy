package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AccusedController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Accused.list(params), model:[accusedInstanceCount: Accused.count()]
    }

    def show(Accused accusedInstance) {
        respond accusedInstance
    }

    def create() {
        respond new Accused(params)
    }

    @Transactional
    def save(Accused accusedInstance) {
        if (accusedInstance == null) {
            notFound()
            return
        }

        if (accusedInstance.hasErrors()) {
            respond accusedInstance.errors, view:'create'
            return
        }

        accusedInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'accusedInstance.label', default: 'Accused'), accusedInstance.id])
                redirect accusedInstance
            }
            '*' { respond accusedInstance, [status: CREATED] }
        }
    }

    def edit(Accused accusedInstance) {
        respond accusedInstance
    }

    @Transactional
    def update(Accused accusedInstance) {
        if (accusedInstance == null) {
            notFound()
            return
        }

        if (accusedInstance.hasErrors()) {
            respond accusedInstance.errors, view:'edit'
            return
        }

        accusedInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Accused.label', default: 'Accused'), accusedInstance.id])
                redirect accusedInstance
            }
            '*'{ respond accusedInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Accused accusedInstance) {

        if (accusedInstance == null) {
            notFound()
            return
        }

        accusedInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Accused.label', default: 'Accused'), accusedInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'accusedInstance.label', default: 'Accused'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
