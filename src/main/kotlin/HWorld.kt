fun main () {
  for (i in 1..10){
    if (i == 3) continue//ou if (i in 4..7) continue// ou if (i !in 4..7) continue
    println(i)
  }

  for (i in 1..10){
    if (i !in 4..7) print('-') else print('+')
    println(i)
  }
  for (i in 1..10){
    val prefix =if(i==1){
      '*'
    }else if (i !in 4..7) {
      print('-')
      '>'
    } else {
      '+'
    }
    println("$prefix$i")
  }
  val a = 9
    if (a in 0..11){
      println("Good Morning")
    }else if (a==12){
      println("Time for Lunch")
    }else{
      println("Time for Rest Boy")
    }
}


