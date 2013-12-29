package org.krpt

class Branch {
	Integer contactId
	String name
	Integer addressId
	
	static belongsTo = [department:Department]
	
    static constraints = {
		contactId nullable:true 
    }
}
