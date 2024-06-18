package KotlinExercise

import java.util.Date

//Add, Sub, Mul, Div of two numbers

fun operations(a: Int, b: Int) {
    val sum = a + b
    println("Sum is $sum")
    val diff = a - b
    println("Diff is $diff")
    val mul = a * b
    println("Multiplication is $mul")
    val div = a / b
    println("Division is $div")
}

fun oddOrEven(c: Int) {
    if (c % 2 == 0) {
        println("Number is even")
    } else
        println("Number is odd")
}


fun main() {
    println("Hello \n Sakshi")

    println("Today date is: " + Date())

    val kotlinVersion = KotlinVersion.CURRENT
    println("Kotlin version is$kotlinVersion")

    operations(10, 5)
    oddOrEven(10)


}
