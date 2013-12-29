package org.krpt

import java.sql.Date;

class Case {
	Integer departmentId
	Integer branchId
	Date dateCreated
	Date lastUpdated
	Date incidentDate
	Accused accused
	BigDecimal amount
	
	static hasMany = [evidences:Evidence]
	static belongsTo = [user:User]
    
	static constraints = {
		departmentId nullable:true 
		branchId nullable:true
		amount nullable:true    
    }
}
