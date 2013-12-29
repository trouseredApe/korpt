package org.krpt



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserCredentialController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UserCredential.list(params), model:[userCredentialInstanceCount: UserCredential.count()]
    }

    def show(UserCredential userCredentialInstance) {
        respond userCredentialInstance
    }

    def create() {
        respond new UserCredential(params)
    }

    @Transactional
    def save(UserCredential userCredentialInstance) {
        if (userCredentialInstance == null) {
            notFound()
            return
        }

        if (userCredentialInstance.hasErrors()) {
            respond userCredentialInstance.errors, view:'create'
            return
        }

        userCredentialInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'userCredentialInstance.label', default: 'UserCredential'), userCredentialInstance.id])
                redirect userCredentialInstance
            }
            '*' { respond userCredentialInstance, [status: CREATED] }
        }
    }

    def edit(UserCredential userCredentialInstance) {
        respond userCredentialInstance
    }

    @Transactional
    def update(UserCredential userCredentialInstance) {
        if (userCredentialInstance == null) {
            notFound()
            return
        }

        if (userCredentialInstance.hasErrors()) {
            respond userCredentialInstance.errors, view:'edit'
            return
        }

        userCredentialInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UserCredential.label', default: 'UserCredential'), userCredentialInstance.id])
                redirect userCredentialInstance
            }
            '*'{ respond userCredentialInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(UserCredential userCredentialInstance) {

        if (userCredentialInstance == null) {
            notFound()
            return
        }

        userCredentialInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UserCredential.label', default: 'UserCredential'), userCredentialInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'userCredentialInstance.label', default: 'UserCredential'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
