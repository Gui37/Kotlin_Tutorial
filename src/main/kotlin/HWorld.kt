fun main () {
    println(getMax(20,30))
    println(getMax(20.5,30.63))
    println(getMax(2654519854540,3065464561))
    println(getMax(21.23120,30123.12312))
    println(getMax(220,330,40))

}
//This is called function overloading
//we can use it when we have multiple cases with different types


fun getMax(a: Int, b: Int)= if (a>b) a else b

fun getMax(a: Double, b: Double)= if (a>b) a else b

fun getMax(a: Long, b: Long)= if (a>b) a else b

fun getMax(a: Float, b: Float)= if (a>b) a else b

//with function overloading we can change the number of arguments, but not the names of it
fun getMax(a: Int, b: Int, c:Int)=
    when{
        a>=b && a>=c ->a
        b>=a && b>=c ->b
        else -> c
    }


