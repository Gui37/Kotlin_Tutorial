fun main () {
    println(getSum(1,3, 5, 6)) //we can override the default value of the arguments of the function

    //vararg operator stands for variable argument
    println(getSum2(1,3, 5, 6,25,59,359,22)) //usage of vararg to use multiple values in the function call

    val array = intArrayOf(1,5,8,96,3,2)
    println(getSum2(*array)) //* this is called a spread operator

    //with the spread operator we can pass the values of an array to a function & before and after the spread operator
    println(getSum2(32,10,*array,10,15,3))

    println(getSum3(32,10,*array,10,3,b=15))
    println("The biggest value is :"+getMax(100,52,22,468,54,123))
}

fun getSum(a:Int,b:Int,c:Int=0,d:Int=0):Int{
    return a + b + c + d
}
// if we want to pass multiple values in the function, we must use the vararg in the arguments, instead of an array
//arrayOf<Int> doesn't work when we call the function
fun getSum2(vararg numbers:Int):Int{ // in Java, we do int... name_of_the_variable
    var sum =0
    for (number in numbers){
        sum+=number
    }
    return sum
}

fun getSum3(a:Int,vararg numbers:Int,b:Int):Int{ // in Java, we do int... name_of_the_variable
    var sum =a+b
    for (number in numbers){
        sum+=number
    }
    return sum
}

fun getMax(first:Int,vararg remain:Int):Int{
    var max = first
    for (i in remain){
        if (i>max){
            max=i
        }
    }
    return max
}

