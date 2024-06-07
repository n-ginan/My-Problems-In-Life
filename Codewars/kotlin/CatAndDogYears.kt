fun main() {
    print(calculateYears(10))
}

fun calculateYears(years: Int): Array<Int> {
    when {
        years == 1 -> return arrayOf(1, 15, 15)
        years == 2 -> return arrayOf(2, 24, 24)
        years > 2 -> return arrayOf(years, (years - 2) * 4 + 24, (years - 2) * 5 + 24)
    }
    return arrayOf(0, 0, 0);
}

/*
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years

15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years

15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
*/
