package me.invkrh.sim

import org.scalatest.FlatSpec

class GreeterTest extends FlatSpec {
  "Greeter" should "say Hi" in {
    val greeter = new Greeter
    assertResult("Hi") {
      greeter.sayHi()
    }
  }
}
