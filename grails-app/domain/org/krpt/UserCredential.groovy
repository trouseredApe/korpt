package org.krpt


class UserCredential {
	String userName;
	String password;
	
	static belongsTo = [user:User]
	
    static constraints = {
    }
}
