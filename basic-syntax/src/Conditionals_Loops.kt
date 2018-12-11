fun main(args: Array<String>) {

    /*In this file conditionals and loops will be demonstrated in this file
    * - If-Else statements
    * - When statements
    * - For Loops
    * - While / Do While Loops
    * */

    val nums: Int = 2
    val count: Int = 10

    // this how a an if statement is used

    if(nums > count){
        println("nums is bigger than the count")
    }else if( nums == count){
        println("They are the same")
    }else{
        println("nums is smaller than the count")
    }

    // this is a when statement
    // Its basically like a switch statement in java
    val temp: Int = 5

    when(count) {
        temp -> println("count is: " + count)
        nums -> println("not equal")
        else -> {
            println("Not equal to " + temp + " or " + nums )
        }
    }

    // This is how for loops are used in Kotlin
    val array: IntArray = intArrayOf(1,2,3,2,2,4,3,2,2,3,1,5)
    var counter: Int = 0

    for(i : Int in array){

        if(i == nums) {
            counter++
        }
    }

    println("Occurrences of " + nums + ", is " + counter + " times")

    // this is how while/do while loops work

    // this loop will still use the value from counter in for loop since counter wasn't reset
    while(counter <= 10){
        println("updated counter: " +counter)
        counter ++
    }

    println("counter after first while loop: " +counter)

    do {
        counter = counter + 10
        println("Updated counter from Do While loop: " + counter)
    }while (counter <=50)


}