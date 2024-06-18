package objectoriented

class Person {

    var name: String = "Sarah"
    var age: Int = 18

    //Specifying the return type
    fun speak() : String {
        return "Speak";
    }

    fun action(){
        println("Hello!")
    }

    fun greet(address : String){
        println("Address is $address")
    }
}

fun main(){
    val person = Person()
    println(person.name)
    println(person.age)

    person.name = "Tarah"
    println(person.name)

    println(person.speak())
    person.action()
    person.greet("Mumbai")
}