# _Your project title_

- Leonard Zbona
- leonard.zbona@uoit.net

## About the language

> _Describe the language_
>
> - Kotlin was released on Febuary 15 2016, it was designed by a team at Jetbrains to be used as an alternative to programming Adroid apps in java, just like how switf is used in programming apps on IOS
> - Some interesting features:
> - Its an easy language to learn
> - It uses the Java Virtual Machine to compile its code
> - It has similar syntax to both java and javascript
> - Its used heavily in the development of Android applications

## About the syntax

> _This is an example of a Collection in Kotlin_

*Collection*

```kotlin
fun main(args: Array<String>) { 
   val numbers: MutableList<Int> = mutableListOf(2, 3, 5) //mutable List 
   val readOnlyView: List<Int> = numbers                  // immutable list 
   
   println("my mutable list: "+numbers)        // prints "[2, 3, 5]" 
   numbers.add(4) 
   println("my mutable list after adding: "+numbers)        // prints "[2, 3, 5, 4]" 
   println(readOnlyView)     
   
   // gives error  
   readOnlyView.clear()    // ⇒ does not compile  
}
```

## About the tools

> _Describe the compiler or interpreter needed_.
> Jetbrains IDEA offers a good enviroment to write Kotlin code in
> Android Studio also offers an enviroment to compile Kotlin code but its only used to develop android applications
> 

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


