package org.lazycoders.tuingular

class UserController {

	def login() {
		def msg_result = 'FAIL'
		if (params.login != null && params.passwd != null) {
			def user = User.findByLogin(params.login)

			if (user) {
				if (user.passwd == params.passwd) {
					session.user = user
					msg_result = 'OK'
				}
			}
		}

		render(contentType: "text/json") {
			result = msg_result 
		}
	}

	def logout() {
		session.user = null
		render(contentType: "text/json") {
			result = 'OK'
		}
	}
}
