fun main() {
    print(filterList(listOf(3, 1, "fee", 3, 'a', 32.1)))
}

fun filterList(l: List<Any>): List<Int> = l.filterIsInstance<Int>()

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

Example

filterList(ListOf(1, 2, "a", "b")) == [1, 2]
filterList(ListOf(1, "a", "b", 0, 15)) == [1, 0, 15]
filterList(ListOf(1, 2, "a", "b", "aasf", "1", "123", 123)) == [1, 2, 123]
*/