fun main(args: Array<String>) {

    /*
    * In this file there are examples on the basic syntax in Kotlin
    */

    /*
    * In kotlin there are two types of Variables
    * The first is a var and it can be altered throughout the program
    * The second is a val which is constant and cant be altered
    * */
    //this is how you declare an integer
    val intiger: Int  = 100000

    // this is how you declare a double
    val db: Double = 10.55

    // this is how you declare a float
    val fl: Float = 100.54f

    //this is a long variable
    val long: Long
    // this is variable assignment
    long = 100030300303003


    // this is a short variable
    var short: Short = 10

    // this is the declaration of a byte:
    var b: Byte
    //this is assigining data to a variable
    b = 1

    // this is how a char is declared:
    val c: Char
    // this is assiging a value to the char
    c = 'A'

    // this is a deceleration of boolean variables
    var bool: Boolean
    bool = true

    /*
    * In Kotlin there are two types of Strings, Raw strings and Escaped Strings
    * Escaped strings allow for endline charaters to be added at the end
    * */
    
    var rawString :String  = "Hello this is raw string"
    val escapedString : String  = "hello this is an escaped string \n"

    println("These are the standard variables: ")
    println("Int Value is "+intiger)
    println("Double  Value is "+db)
    println("Float Value is "+fl)
    println("Long Value is "+long)
    println("Short Value is "+short)
    println("Byte Value is "+b)
    println("Char Value is "+c)
    println("The bool value is: " +bool)
    println()

    println(escapedString)
    println(rawString)



}
