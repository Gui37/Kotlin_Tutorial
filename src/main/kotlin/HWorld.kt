fun main () {
  var i = 0
  var a =5
  do{
    println(a)//ou println(i++)
    a++
  } while (a<5)
println("*----------------------------*")
  while (i<5){
    println(i)//ou println(i++)
    i++
  }
  println("*----------------------------*")
  do{
    println(i)//ou println(i++)
    i++

    var j =0
    while (j<5){
      println("-----$j")
      j++
      break
      print("I'm not printed")
    }
    println("I am printed")
  } while (i<9)
  println("*----------------------------*")
  do{
    println(i)//ou println(i++)
    i++
    continue
    var j =0
    while (j<5){
      println("-----$j")
      j++
      break
      print("I'm not printed")
    }
    println("I am printed")
  } while (i<9)
  println("*----------------------------*")
  outer@do{
    println(i)//ou println(i++)
    i++
    var j =0
    while (j<5){
      println("-----$j")
      j++
      break@outer
      print("I'm not printed")
    }
    println("I am printed")
  } while (i<10)

  println("*----------------------------*")
  var x = 100
  var cont=0
  while (x>1) {
      x = x / 2
      cont++
  }
  println(cont)

}