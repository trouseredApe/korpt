package org.krpt

class Department {
	Long addressId
	Integer contactId
	String name

	static hasMany = [branches:Branch]

	static constraints = {
		contactId nullable:true
	}
}
