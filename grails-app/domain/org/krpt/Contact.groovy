package org.krpt

import java.sql.Date;

class Contact {
	String fname
	String lname
	Boolean primaryContact
	String email
	String phone
	Integer departmentId
	Integer branchId
	Date dateCreated
	Date lastUpdated
	
	static constraints = {
		departmentId nullable:true 
		branchId nullable:true 
		email nullable:true
    }
}
