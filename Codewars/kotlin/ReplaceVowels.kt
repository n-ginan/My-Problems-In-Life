fun main() {
    print(replace("Testingin mo ako"))
}

fun replace(s: String): String = s.replace("[aeiouAEIOU]".toRegex(), "!")

/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

Examples

replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"
*/