trait Boo {
	def hello
}

class BooImpl extends Boo {
	override def hello = println("hello")
}

class BooImpl2 extends Boo {
	override def hello = println("hello again")
}

object Test extends App {
	val b1 = new BooImpl
	val b2 = new BooImpl2

	b1.hello
	b2.hello
}