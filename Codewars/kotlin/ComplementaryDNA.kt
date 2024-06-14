fun main() {
    print(makeComplement("ATTGC"))
}

fun makeComplement(dna : String) : String {
    var str = StringBuilder()
    for (i in dna.indices) {
        when(dna.get(i)) {
            'A' -> str.append('T')
            'T' -> str.append('A')
            'C' -> str.append('G')
            'G' -> str.append('C')
        }
    }
    return str.toString()
}

/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
*/