import java.io.File

fun main() {
    val useFileInput = false //dont forget to tick this to false if done testing pog

    val input = if (useFileInput) {
        File("input.txt").bufferedReader().readLines().toMutableList()
    } else {
        generateSequence(::readLine).toList().toMutableList()
    }

    for (i in input.indices.reversed()) {
        if (input[i][0].isDigit()) {
            input.removeAt(i)
        }
        if (input[i].length > 10) {
            var string = "${input[i].get(0)}${input[i].length-2}${input[i].get(input[i].length-1)}"
            input[i] = string
        }
    }
    for (text in input) {
        println(text)
    }
}