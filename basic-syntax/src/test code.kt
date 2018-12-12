fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {  // High Level Function with Lambda as Parameter

    action(a, b)
}

fun main(args: Array<String>) {

    var result = 0

    addTwoNumbers(2, 7) {x, y -> result = x + y}

    println(result)
}
