trait Boo {
	def hello
}

class BooImpl extends Boo {
	override def hello = println("hello")
}