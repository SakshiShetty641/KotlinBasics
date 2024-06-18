package objectoriented

/*
The primary constructor is part of the class header and is declared directly after the class name.
 Secondary constructors are declared inside the class body.
 */

class Constructors(val name: String, var age: Int) {

    //The init block runs after the primary constructor and can be used for additional initialization.
    init {
        println("Person initialized with name = $name and age = $age")
    }
}



fun main() {
    val constructor = Constructors("Sarah", 25)
    println("Name: ${constructor.name}, Age: ${constructor.age}")

}

