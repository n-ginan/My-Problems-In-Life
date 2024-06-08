fun main() {
    println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
}

fun longest(s1:String, s2:String):String {

    var filtered: CharArray = (s1 + s2).toSet().toCharArray()
    
    for (i in filtered.indices) {
        for (j in 0 until filtered.size - 1) {
            if (filtered[j] > filtered[j+1]) {
                var holder = filtered[j]
                filtered[j] = filtered[j+1]
                filtered[j+1] = holder
            }
        }
    }

    return filtered.joinToString("")
}

/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

BEST PRACTICE = (s1 + s2).toSortedSet().joinToString("")
THERE IS A SORTED SET?????
*/