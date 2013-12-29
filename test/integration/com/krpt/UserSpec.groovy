package com.krpt



import org.krpt.User

import spock.lang.*

/**
 *
 */
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
		User user1 = new User(admin:false, superUser:false, fname:'Pratik', lname:'Pandey', gender:'Male')
		assertNotNull(user1.save())
		
    }
}
