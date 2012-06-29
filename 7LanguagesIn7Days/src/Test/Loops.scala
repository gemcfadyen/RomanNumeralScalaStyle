package Test

object Loops {

  def main(args: Array[String]): Unit = {

    def whileloop {
      var i = 1
      while (i <= 3) {
        println(i)
        i += 1
      }
    }
    whileloop

    def forloop {
      println("for looping using java-style iteration")
      for (i <- 0 until args.length) {
        println(args(i))
      }

    }
    forloop

    def rubyStyleForLoop {
      println("For loop using ruby-style iteration")
      args.foreach { arg => println(arg)}
    }
    rubyStyleForLoop
  }
}