fun main() {
    print(prevMultOfThree(952406))
}

fun prevMultOfThree(n: Int): Int? {
    var builder = StringBuilder(n.toString())
    while (builder.length != 0) {
        if (builder.length == 1 && builder.toString().toInt() % 3 != 0) {
            return null
        }
        if (builder.toString().toInt() % 3 != 0) {
            builder.deleteCharAt(builder.length - 1)
        } else {
            break
        }
    }
    return builder.toString().toInt()
}

/*
Given a positive integer n: 0 < n < 1e6, remove the last digit until you're left with a number that is a multiple of three.

Return n if the input is already a multiple of three, and if no such number exists, return null, a similar empty value, or -1.

Examples

1      => null
25     => null
36     => 36
1244   => 12
952406 => 9

BEST SOLUTION:
fun prevMultOfThree(n: Int): Int? = when{
    n == 0 -> null
    n % 3 == 0 -> n
    else -> prevMultOfThree(n / 10) RECURSION
} ACTUALLY GOOD
*/