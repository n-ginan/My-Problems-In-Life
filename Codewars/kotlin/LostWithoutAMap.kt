fun main() {
    val array: IntArray = intArrayOf(3, 2, 1, 6)
    print(maps(array)[1])
}

fun maps(x: IntArray): IntArray {
    var empty = IntArray(x.size)
    for (i in 0 until x.size) {
        empty[i] = x[i] * 2
    }
    return empty
}
/*
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

BEST SOLUTION: fun maps(x : IntArray) = x.map { it * 2 }.toIntArray()
*/