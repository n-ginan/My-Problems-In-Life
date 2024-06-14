fun main() {
    print(alphabetWar("zdqmwpbs"))
}

fun alphabetWar(fight: String): String {
    var left = 0
    var right = 0
    for (i in fight.indices) {
        when(fight.get(i)) {
            'w' -> left += 4
            'm' -> right += 4
            'p' -> left += 3
            'q' -> right += 3
            'b' -> left += 2
            'd' -> right += 2
            's' -> left += 1
            'z' -> right += 1
        }
    }
    return if (left < right) "Right side wins!" else if (left > right) "Left side wins!" else "Let's fight again!"
 }

/*
Introduction

There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.

Task

Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1
The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1
The other letters don't have power and are only victims.

BEST SOLUTION:
val forces = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1, 'm' to -4, 'q' to -3, 'd' to -2, 'z' to -1)
    val result = fight.sumBy { forces.getOrDefault(it, 0) }
    return when {
        result > 0 -> "Left side wins!"
        result < 0 -> "Right side wins!"
        else -> "Let's fight again!"
    }
*/