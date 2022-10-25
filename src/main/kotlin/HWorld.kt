var topLevelVariable = "Im a top-level variable"//This variable can be used in any function and should always be declared
const val STRING_CONSTANT = "Im a constant" // In this case the variable is immutable, and we add a const to explicit it
fun main () {
    println(topLevelVariable)
    topLevelVariable = "I can change"
    println("The biggest value is :"+getMax(100,52,22,468,54,123))

}
fun getMax(first:Int,vararg remain:Int):Int{
    println(topLevelVariable)
    println(STRING_CONSTANT)
    var max = first
    for (i in remain){
        if (i>max){
            max=i
        }
    }
    return max
}


