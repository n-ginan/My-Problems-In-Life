fun main() {
    val test: List<String> = listOf("3:2", "10:2")
    var totalPoints: Int = 0
    for (i in 0 until test.size) {
        val digit = test.get(i)
        val listOfDigits = digit.split(":")
        val x: Int = listOfDigits.get(0).toInt()
        val y: Int = listOfDigits.get(1).toInt()
        when {
            x > y -> totalPoints += 3
            x == y -> totalPoints += 1
        }
    }
}

/*Our football team has finished the championship.

Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y", where x is our team's score and y is our opponents score.

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.

Notes:

our team always plays 10 matches in the championship
0 <= x <= 4
0 <= y <= 4*/

