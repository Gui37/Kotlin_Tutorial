fun main() {
    val person1 =Person("Dante",25,170)
    val person2 =Person("",25,170)
    val person3 =Person("Jane",29,150)
    val person4 =Person("Dee",35,130)
}
class Person(name: String, var age: Int, var height: Int){
    init {
        println("New Person created.")
    }

    val name2:String
    init {
        if (name.isBlank()) {
            this.name2 = "John Doe or Jane Doe"
        }else{
            this.name2=name.trim()
        }
        println("Name: ${this.name2} Age:$age  Height:$$height")
    }
}