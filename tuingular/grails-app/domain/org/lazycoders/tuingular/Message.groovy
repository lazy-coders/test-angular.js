package org.lazycoders.tuingular

class Message {
	String text
	Date wrote_in
	static belongsTo = User

	static {
		grails.converters.JSON.registerObjectMarshaller(Message) { message ->
			return [
				id: message.id,
				text: message.text,
				wrote_in: message.wrote_in
			]
		}
	}

    static constraints = {
    }
}
