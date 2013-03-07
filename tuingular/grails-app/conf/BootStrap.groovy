import org.lazycoders.tuingular.User
import org.lazycoders.tuingular.Message

class BootStrap {
	def init = { servletContext ->
		User u = new User(login:'laparca', passwd:'laparca', name:'I am Laparca', email:'samrs65@gmail.com')
		u.addToMessages(new Message(text: "ola k ase", wrote_in: new Date()))
		u.addToMessages(new Message(text: "perrea perrea", wrote_in: new Date()))
		u.addToMessages(new Message(text: "grasias de antebraso", wrote_in: new Date()))
		u.addToMessages(new Message(text: "ains", wrote_in: new Date()))
		u.save(failOnError: true)
	}

	def destroy = {
	}
}
