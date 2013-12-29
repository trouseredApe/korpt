package org.krpt

import java.sql.Date;


class User {
	String fname
	String lname
	Address address
	String gender
	String admin
	String superUser
	Date dateCreated
	Date lastUpdated

	static hasMany = [cases:Case]
	//static hasOne = [credential: UserCredential]

	static constraints = {
		fname(nullable:true)
		lname(nullable:true)
		gender(nullable:true)
		address nullable:true 
	}
}
