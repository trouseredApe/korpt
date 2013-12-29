package org.krpt

import java.sql.Date;

class Address {
	String address
	String city
	String postalcode
	String province
	String country
	String phone
	String email
	Date dateCreated
	Date lastUpdated
	
	
	
    static constraints = {
		address nullable:true 
		city nullable:true 
		postalcode nullable:true 
		province nullable:true 
		country nullable:true 
		phone nullable:true 
		email nullable:true 
    }
}
