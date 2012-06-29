package classes

class Person(firstName: String) {
	println("Outer Constructor")
  def this(firstName: String, lastName: String) {
    this(firstName)
    println("Inner Constructor")
  }
  
  def talk() = println("Hi")
}

