fun main() {
    print(encodeCd(222u))
}

fun encodeCd(n: UByte): String {
    val initial = "P"
    var builder: StringBuilder = StringBuilder()
    var switch = true
    var nToModulo: UByte = n
    var nVar = n
    while (builder.length != 8) {
        when {
            nToModulo % 2u == 1u -> {
                nVar = (nVar/ 2u.toUByte()).toUByte()
                nToModulo = nVar
                if (switch == true) {
                    builder.append("L")
                    switch = false
                } else if (switch == false) {
                    builder.append("P")
                    switch = true
                }
            }
            nToModulo % 2u == 0u -> {
                nVar = (nVar/ 2u.toUByte()).toUByte()
                nToModulo = nVar
                if (builder.length < 1) {
                    builder.append(initial)
                } else {
                    builder.append(builder.substring(builder.length-1))
                }
            }
        }
    }
    return initial + builder.toString()
}

/*
"Pits" and "lands" are physical features on the surface of a CD that represent binary data. Pits are small depressions or grooves on the surface of the CD, while lands are flat areas between two adjacent pits.

The pits and lands themselves do not directly represent the zeros and ones of binary data. Instead, Non-return-to-zero, inverted encoding is used: a change from pit to land or land to pit indicates a one, while no change indicates a zero.

In this Kata, you should implement a function, that takes integer in range [0..255] (8 bits), and returns combination of pits and lands that encode the number. Result should have format of string: PLLPL... where P represents pit and L represents land. Combination should always start with pit. Numbers should be encoded in little-endian, which means you start from least significant bit.

Example

Input: 5

Binary representation (8 bits): 00000101

Output: PLLPPPPPP

Explanation:

Starts from P as per description
Changes to L because first bit is 1
Stays L because second bit is 0
Changes to P because third bit is 1
Stays P because fourth bit is 0
Stays P till the end because all subsequent bits are 0

LIKED THIS SOLUTION:
fun encodeCd(n: UByte): String {
    var n = n.toUInt();
    var res = "P";
    var cur = "P";
    for (_i in 1..8) {
        if (n % 2u == 1u) cur = if (cur == "P") "L" else "P";
        res += cur;
        n /= 2u;
    }
    return res;
}
*/