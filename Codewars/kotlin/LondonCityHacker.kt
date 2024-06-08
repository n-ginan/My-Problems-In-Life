import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    print(londonCityHacker(arrayOf("Piccadilly", 56, 93, 243, 20, 14)))
}

fun londonCityHacker(journey: Array<Any>): String {
    var cost: Double = 0.00
    var count: Int = 0
    for (path in journey) {
        when {
            path is String -> {
                cost += 2.40
                count = 0
            }
            path is Int -> {
                ++count
                if (count % 2 == 1) {
                    cost += 1.50
                }
            }
        }
    }
    return "£${BigDecimal(cost).setScale(2, RoundingMode.HALF_EVEN)}"
}

/*
You are given a sequence of a journey in London, UK. The sequence will contain bus numbers and TFL tube names as strings e.g.

arrayOf("Northern", "Central", 243, 1, "Victoria")
Journeys will always only contain a combination of tube names and bus numbers. Each tube journey costs £2.40 and each bus journey costs £1.50. If there are 2 or more adjacent bus journeys, the bus fare is capped for sets of two adjacent buses and calculated as one bus fare for each set.

For example: 'Piccadilly', 56, 93, 243, 20, 14 -> "£6.90"

Your task is to calculate the total cost of the journey and return the cost rounded to 2 decimal places in the format (where x is a number): £x.xx
*/