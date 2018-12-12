import java.util.*
import kotlin.*

fun main(args: Array<String>) {

    //This is the use of the built in binarySearch function
    val list = mutableListOf(1, 2, 4, 5, 3)

    val position: Int = list.binarySearch(4) // 3

    println("The Number 4 is found at index: " + position)

    // the number 5 is removed from the list
    list.remove(5)

    // the number can be inserted back in two ways
    // this gets the end of the list
    val invertedInsertionPoint = list.binarySearch(5)
    // this creates the insertion point
    val actualInsertionPoint = -(invertedInsertionPoint + 1)
    println(actualInsertionPoint) // 3

    // this inserts the number 5 at the back
    list.add(actualInsertionPoint, 5)
    println(list) // [a, b, c, d, e]
    println()


    //Here we demonstrate the built in sort function in Kotlin on 3 different arrays:

    // first we declare the unsorted lists,
    // in this case we have an array of Integers, Strings of the same size, and doubles
    val array1: IntArray = intArrayOf(12,55,111,233,5,1,22,77,100,250)
    val array2: Array<String> = arrayOf("Leona","Billy", "Kevin", "Aaron", "Sammy", "Danil")
    val array3: DoubleArray = doubleArrayOf(1.5, 22.3, 33.3, 15.0, 2.2, 3.3, 0.5)

    // here we print out the unsorted lists
    println("Unsorted Lists")
    println(Arrays.toString(array1))
    println(Arrays.toString(array2))
    println(Arrays.toString(array3))

    println()

    // This is where we used the built in functions to sort the lists
    println("Stored Lists:")
    var  sortedArray1: IntArray = array1.sortedArray()

    // in the cases of strings, they are sorted by the value of the first character in the string
    var  sortedArray2: Array<String> = array2.sortedArray()

    val  sortedArray3: DoubleArray = array3.sortedArray()


    println(Arrays.toString(sortedArray1))
    println(Arrays.toString(sortedArray2))
    println(Arrays.toString(sortedArray3))


}