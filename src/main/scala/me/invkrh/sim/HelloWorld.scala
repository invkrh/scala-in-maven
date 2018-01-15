package me.invkrh.sim

class Greeter {
  def sayHi() = "Hi"
}

object HelloWorld extends App {
//  import org.joda.time.DateTime
//  val dt = DateTime.now()
//  println(dt)
  val greeter = new Greeter
  println(greeter.sayHi())
}
