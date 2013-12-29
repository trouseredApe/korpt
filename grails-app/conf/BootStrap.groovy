import javax.transaction.UserTransaction;
import org.krpt.User

class BootStrap {

    def init = { servletContext ->
		User user1 = new User(admin:false, superUser:false, fname:'Pratik', lname:'Pandey', gender:'Male').save(flush:true, failOnError:true)
	}
    def destroy = {
    }
}
