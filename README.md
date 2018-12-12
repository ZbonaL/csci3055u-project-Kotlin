# _How to Kotlin and stuff_

- Leonard Zbona
- leonard.zbona@uoit.net

## About the language

> _Describe the language_
>
> ### _History_
> - Kotlin was released on Febuary 15 2016, it was designed by a team at Jetbrains to be used as an alternative to programming Adroid apps in java, just like how switf is used in programming apps on IOS

>  ### _Some interesting features:_
> - Its an easy language to learn
> - It uses the Java Virtual Machine to compile its code
> - It has similar syntax to both java and javascript
> - Its used heavily in the development of Android applications

## About the syntax

> _This is an example of a Collection in Kotlin_

*Collection*

```kotlin
fun main(args: Array<String>) { 
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
```

## About the tools

> _Describe the compiler or interpreter needed_.

> ### _IDE's_
> - Jetbrains IDEA offers a good enviroment to write Kotlin code in
> - Android Studio also offers an enviroment to compile Kotlin code but its only used to develop android applications
> - Visual Studio also can be used to write Kotlin code

> ### _Compilers_
> There is a standalone compiler that can be used to run indvidual kotlin files using the command line
> https://kotlinlang.org/docs/tutorials/command-line.html

> ### _Build Tools_
> Below is a list of build tools that are supported by Kotlin:
> - Gradle
> - Maven
> - Ant

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> ### Klaxon JSON Parser
> - Klaxon is an open source JSON parser for Kotlin
> - An example of how to use it is in the /real-app folder
> - Link to the repo for Klaxon: https://github.com/cbeust/klaxon

# Analysis of the language

> 1. The style of programming supported by Kotlin: 
> Kotlin uses both procedural and functional programming constructs, allowing for code to be a mix of functional and object-oriented code to be developed

> 2. Meta-Programming in Kotlin:
> Kotlin doesn't support Meta Programming

> 3.Kotlin's support for closure
> 
```kotlin
// Unit is like a datatype declration for the function
// Unit is like declaring the function as void 
fun addition(a: Int, b: Int, action: (Int, Int) -> Unit) {
   // this is used to store the two inputed variables to be used later
    action(a, b)
}

fun main(args: Array<String>) {
   // this result variable cant be modified inside the addition function
   // but it can be updated in the main function 
    var result = 0
    addition(2, 7) {x, y -> result = x + y}
    println(result)
   
}
```
> 4. Scoping in Kotlin:
> - Scoping in Kotlin is done using Visiblity Modifiers.
> - the ```Kotlin internal``` modifire allows for code to be accessed by the whole module


> 5. Functional Programming in Kotlin using Kotlin standard library:
> - Kotlin does support functional programming as a build in feature

> 6. Static Vs Dynamic types in Kotlin:
> - Kotlin Uses Static types instead if the dynamic types used in clojure

> 7. Strengths vs Weaknesses  
> - ### Strengths:
> - Better performance in a smaller runtime
> - Can compile existing Java code
> - Easy to maintain

> - ### Weaknesses:
> - Allows for functions to be called at the top level, but as these functions are altered, then it is hard to understand which function is being called.
> - Has a small developer community
> - computation times can fluctate
