fun main () {
    greet("Dante", 5)
    greet2("Dante", 5)
    printMax(30,30)
}
fun greet(name:String, rep:Int) {
    for (i in 0 until rep) {
        println("Hello There! Your name is $name")
    }
}

fun greet2(name: String, rep: Int){
    var repLeft = rep
    while(repLeft>0){
        println("Hi There! Your name is $name")
        repLeft--
    }
}

fun printMax(numb1: Int, numb2: Int){
    if (numb1>numb2){
        println("The larger number of these two is $numb1")
    }else if (numb2>numb1){
        println("The larger number of these two is $numb2")
    } else{
        println("There is no larger number, they have the same value $numb1 = $numb2")
    }
}


