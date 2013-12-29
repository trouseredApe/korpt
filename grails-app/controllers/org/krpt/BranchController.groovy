package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BranchController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Branch.list(params), model:[branchInstanceCount: Branch.count()]
    }

    def show(Branch branchInstance) {
        respond branchInstance
    }

    def create() {
        respond new Branch(params)
    }

    @Transactional
    def save(Branch branchInstance) {
        if (branchInstance == null) {
            notFound()
            return
        }

        if (branchInstance.hasErrors()) {
            respond branchInstance.errors, view:'create'
            return
        }

        branchInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'branchInstance.label', default: 'Branch'), branchInstance.id])
                redirect branchInstance
            }
            '*' { respond branchInstance, [status: CREATED] }
        }
    }

    def edit(Branch branchInstance) {
        respond branchInstance
    }

    @Transactional
    def update(Branch branchInstance) {
        if (branchInstance == null) {
            notFound()
            return
        }

        if (branchInstance.hasErrors()) {
            respond branchInstance.errors, view:'edit'
            return
        }

        branchInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Branch.label', default: 'Branch'), branchInstance.id])
                redirect branchInstance
            }
            '*'{ respond branchInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Branch branchInstance) {

        if (branchInstance == null) {
            notFound()
            return
        }

        branchInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Branch.label', default: 'Branch'), branchInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'branchInstance.label', default: 'Branch'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
