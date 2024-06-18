package objectoriented

class SecondaryConstructors {

        var name: String
        var age: Int

        // Primary constructor
        constructor(name: String, age: Int) {
            this.name = name
            this.age = age
        }

        // Secondary constructor
        constructor(name: String) : this(name, 0) {
            println("Secondary constructor called")
        }

}

fun main() {
    val constructor1 = SecondaryConstructors("Sarah", 25)
    println("Name: ${constructor1.name}, Age: ${constructor1.age}")

    val constructor2 = SecondaryConstructors("John")
    println("Name: ${constructor2.name}, Age: ${constructor2.age}")
}
