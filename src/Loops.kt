fun main() {
    var sum = 0;
    for (i in 1..10) {
        println(i)
        sum += 1
        println(sum)
    }
    println(sum)

    val list = listOf("java", "kotlin", "python")
    for(element in list){
        println(element)
    }

    for((index, value) in list.withIndex()){
        println("Element at $index is $value")
    }

    /* While - Loop
    The while loop evaluates the condition before executing the loop body.
    If the condition is true, the loop body is executed. This process repeats until the condition becomes false. */

    var count = 1
    while (count <= 5) {
        println("Count: $count")
        count++
    }


    //break and continue
    for(c in "Python"){
        if (c == 'o'){
            break;
        }
        println(c)
    }

    val list1 = listOf("Book", "Table", "Laptop")
    for(str in list1){
        if(!str.contains('o')){
            continue
        }
        println(str)
    }

    //The break keyword is used to terminate the loop immediately.
    //The continue keyword is used to skip the current iteration of the loop and proceed with the next iteration.
    val list2 = listOf("Book", "Table", "Laptop")
    for(str in list2){
        if(!str.contains('o')){
            break
        }
        println(str)
    }
}