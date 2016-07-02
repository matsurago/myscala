package mypackage

import org.scalatest.FunSuite

/**
  * A test class for mypackage.Hello class.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") _
  val hello = new Hello
  assert(hello.sayHello("Scala") == "Hello, Scala!")
}
