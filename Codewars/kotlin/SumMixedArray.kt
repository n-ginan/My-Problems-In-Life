fun main() {
    print(sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
}

public fun sum(mixed: List<Any>): Int {
    return mixed.sumOf {
        when {
            it is String -> it.toIntOrNull() ?: 0
            it is Int -> it
            else -> throw Exception("Hotdog")
        }
    }
}

/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
*/