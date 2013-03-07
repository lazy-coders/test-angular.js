package org.lazycoders.tuingular

class Message {
	String text
	Date wrote_in
	static belongsTo = User

    static constraints = {
    }
}
