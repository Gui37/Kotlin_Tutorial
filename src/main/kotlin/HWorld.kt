fun main () {
  val names = arrayOf("Test1","Test2","Test3", "Test4","Test5")
    println("The size of this array is ${names.size}")
    println("The first test is : ${names[0]}")
    names [0]= "Test"
    println("The first test is : ${names[0]}")
    println("The last element of this array is ${names[names.size-1]}")
    println("-------------------------------------------------------")
    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)
    println("The size of this array is :${numbers.size}")
    println("The lenght of this array is :${numbers.size-1}")
    println("The last element of this array is ${numbers[numbers.size-1]}")
    println("The sum of the first element and last element is :${numbers[numbers.size-1]+numbers[0]}")
}