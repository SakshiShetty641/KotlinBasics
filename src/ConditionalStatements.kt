fun main() {
    var age = 13;
    if (age < 18) {
        println("Not Applicable")
    } else if (age > 18) {
        println("applicable")
    }

//Conditional statements using when

    val mode = 2
    when (mode) {
        1 -> println("Mode is 1")
        2 -> println("Mode is 2")
        else -> println("Not applicable")
    }

    //Advanced "when" constructs
    var x = 11
    when (x) {
        1 -> println("Print x")
        3 * 2 -> println("Multiplication value")
        in 1..10 -> println("x is between 1 to 10")
        !in 1..10 -> println("x is not between 1 to 10")
    }

    var y = 10
    var result = if (y >= 10) {
        println("y is 10")
    } else {
       println("Not found")
    }

}
