package hackerrank.easy

private fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Get both kangaroos to the same location at the same time
    // If possible return YES else NO
    return if (v1 > v2 && (x1 - x2) % (v2 - v1) == 0) "YES" else "NO"
}

private fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}