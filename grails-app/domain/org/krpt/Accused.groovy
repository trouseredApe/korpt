package org.krpt

import java.sql.Date;


class Accused {
	String fname
	String lname
	Integer addressId
	Date dateCreated
	Date lastUpdated
	String changeBy
	
	static hasMany = [cases: Case]

	static constraints = {
		fname nullable:true 
		lname nullable:true 
		addressId nullable:true 
		changeBy nullable:true 
    }
}
