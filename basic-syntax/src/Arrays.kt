import java.util.Arrays

fun main(args: Array<String>) {
    /*
    * In this section we are going to be looking at arrays and collections
    * */

    // This is how arrays are declared:

    val nums: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    println("nums: " + Arrays.toString(nums))
    println("This is the vaule at index 5: " + nums[5])

    println()

    // This is a collection
    /*There are two types of collections:
    * The first is mutable: This allows for the collections to be altered by the addition of new elements
    * The second is immutable
    * */
    //mutable List
    val mutablelist: MutableList<Int> = mutableListOf(2, 3, 5)

    // immutable list
    val immutablelist: List<Int> = mutablelist

    println("my mutable list: "+mutablelist)        // prints "[2, 3, 5]"

    // adds 4 to the mutable list
    mutablelist.add(4)

    println("my mutable list after adding new number: "+mutablelist)        // prints "[2, 3, 5, 4]"
    println(immutablelist)



}