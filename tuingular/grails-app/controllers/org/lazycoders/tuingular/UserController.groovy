package org.lazycoders.tuingular

class UserController {

	def login() {
		def user = User.findByLogin(params.login)
		def result = 'FAIL'

		if (user) {
			if (user.passwd == params.passwd) {
				session.user = user
				result = 'OK'
			}
		}

		render(contentType: "text/json") {
			result: result 
		}
	}

	def logout() {
		session.user = null
		render(contentType: "text/json") {
			result: 'OK'
		}
	}
}
