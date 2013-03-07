package org.lazycoders.tuingular

class User {
	String login
	String name
	String passwd
	String email

	static hasMany = [following: User, messages: Message]

    static constraints = {
    }
}
