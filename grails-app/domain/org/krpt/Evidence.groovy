package org.krpt

import java.sql.Date;

class Evidence {
	String impactStatement
	String mediaLocation
	String mediaType
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [incident:Case]
	
    static constraints = {
		mediaLocation nullable:true 
		mediaType nullable:true 
    }
}
