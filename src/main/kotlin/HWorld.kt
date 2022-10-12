fun main () {
  val a = 9
  when (a) {
      in 0..11 -> println("Good Morning")
      12 -> println("Time for Lunch")
      else -> println("Time for Rest Boy")
  }
}


