fun main() {
    print(sortSentence("is2 sentence4 This1 a3"))
}

fun sortSentence(s: String): String {
    var split = s.split(" ")
    var pair: HashMap<Int, String> = HashMap<Int, String>()
    var sorted: Array<String?> = arrayOfNulls(split.size)
    for (i in split.indices) {
        pair.put((split[i].substring(split[i].length-1, split[i].length).toInt()) - 1, split[i].substring(0, split[i].length - 1))
    }
    val keys = pair.keys.toList()
    for (i in 0 until sorted.size) {
        sorted[keys.get(i)] = pair.getValue(keys.get(i))
    }
    return sorted.joinToString(" ")
}

/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
*/