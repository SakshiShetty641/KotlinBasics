fun main() {

    //Mutable list
    val array = arrayOf("words", "characters")
    val str = listOf("a", "b", "c")


    val mixed = arrayOf("Kotlin", 17, false)
    println(mixed[1])

    val numbers = intArrayOf(1, 2, 3, 4)

    if(numbers.contains(4)) {
        println("Present")
    } else {
        println("Not present")
    }

    /*
    ArrayList class is used to create a dynamic array in Kotlin.
    Dynamic array states that we can increase or decrease the size of an array as pre requisites.
     */

    var arrayList = arrayListOf("Jack", "Tom", "Harry")
    println(arrayList)
    arrayList.add("Addition")
    println(arrayList)

}