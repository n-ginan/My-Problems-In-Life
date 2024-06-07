fun main() {
    print(include(intArrayOf(1, 2, 3, 4), 5))
}

fun include(arr: IntArray, item: Int): Boolean {
    for (digit in arr) {
        if (digit == item) {
            return true
        }
    }
    return false
}

//BEST SOLUTION: item in arr

//Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.