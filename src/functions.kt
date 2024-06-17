
import java.util.*

fun helloWorld(){
    println("hello World!")
}

fun printWithSpaces(text: String){
    for (char in text){
        print(char + " ")
    }
    println()
}

fun getCurrentDate() : Date {
 return Date()
}

//When a function needs to have a return type then we specify as "fun name() : Int{}" -> Int is thr return type

fun maxOfIntegers(a: Int, b: Int) : Int{
    if(a>= b){
        return a
    }else
     return  b
}


fun main(){
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(maxOfIntegers(3, 6))
}