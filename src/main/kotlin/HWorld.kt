fun main () {
    var maxV = getMax(10,30)
    println(maxV)//we could call the function inside the println function
    maxV = getMax2(50,30)
    println(maxV)//we could call the function inside the println function
    println(double(10))
}

fun getMax(numb1: Int, numb2: Int): Int{
    val max: Int = if (numb1>numb2){
        numb1
    }else
        numb2
    return max
}

fun getMax2(numb3: Int, numb4:Int): Int{
    if (numb3>numb4){
        return numb3
    } else {
        return numb4
    }

}

fun double(num: Int): Int{
    return num*2
}


