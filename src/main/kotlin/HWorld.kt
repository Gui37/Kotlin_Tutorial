fun main () {
    println(greet("How your doing?","Dnt"))
}

fun greet(msg:String, name:String="Gui", rep:Int = 2) {//This is called a default argument
    for (i in 0 until rep) {
        println("Hello There! Your name is $name right? $msg")
    }
}

