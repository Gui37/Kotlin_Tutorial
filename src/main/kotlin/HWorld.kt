fun main () {
    println(double(10))
    println(getMax(20,30))
}

fun double(num: Int): Int= num*2// This is called a single expression function

fun getMax(a: Int, b: Int): Int= if (a>b) a else b

