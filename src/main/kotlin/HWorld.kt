fun main () {
  val names = arrayOf("Test1","Test2","Test3", "Test4","Test5")
    for(name in names){
      println(name)
    }
    for (name in names.indices){
      println("index = $name Element=${names[name]}")

    }

    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)
      for (number in numbers){
        print("$number ")
      }
    for(i in 1..10){//for (i in 1 until 10) nao chega 10
      println(i)
    }
    for (i in 10 downTo 0 step 2){
      println(i)
    }
    for (i in 'a'..'z'){
      println(i)
    }

}