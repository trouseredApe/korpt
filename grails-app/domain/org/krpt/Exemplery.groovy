package org.krpt

import java.sql.Date;

class Exemplery {
	String fname
	String lname
	Long addressId
	String departmentId
	String branchId
	Date dateCreated
	Date lastUpdated
	
	static hasMany = [evidences:Evidence]
	
    static constraints = {
		addressId nullable:true 
    }
}
