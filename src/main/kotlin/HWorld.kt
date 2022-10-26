fun main() { //we have different ways of implement a class in kotlin, like the way we define it inside the class
    //with this one, we define the values in the class, not in the instance of it
    val person = Person()
    println("Person One\nPerson name: ${person.name} \nPerson age: ${person.age} \nPerson height: ${person.height}")

    //Here we define the values in the instance of the class
    val persona= Person2(name="Hobbo",age=35,height=180)
    println("Person One\nPerson name: ${persona.name} \nPerson age: ${persona.age} \nPerson height: ${persona.height}")

}

class Person{
    var name="Gui"
    var age=27
    var height=170
}

class Person2(name: String, var age: Int, var height: Int){//it's called a constructor, and we call it in the instance of the class
    var name=name // inside a class we call it a property instead of variables
}