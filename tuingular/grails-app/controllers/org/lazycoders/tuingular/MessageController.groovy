package org.lazycoders.tuingular

class MessageController {

	def create() {
		def result = 'FAIL'

		if (session.user) {
			User u = User.get(session.user.id)
			Message m = new Message(text: params.text, wrote_in: new Date(), user: u)
			u.addToMessage(m).save()
			result = 'OK'
		}

		render(contentType: "text/json") {
			result: result
		}
	}

	def remove() {
	}

	def list() {
		if (session.user) {
			User u = User.get(session.user.id)
			render(contentType: "text/json") {
				result('OK')
				messages {
					for(m in u.messages) {
						message(id: m.id, text:m.text)
					}
				}
			}

		}
	}

	def view() {
	}
}
