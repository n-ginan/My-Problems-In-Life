fun main() {
    print(hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
}

fun hidePasswordFromConnection(urlString: String): String {
    var builder = StringBuilder(urlString)
    var position = builder.indexOf("d=") + 2
    for (i in position until builder.length) {
        if (builder.get(i) == '&') {
            break
        }
        builder.setCharAt(i, '*') 
    }
    return builder.toString()
}

/*
Preconditions:

non empty valid url
password always next to string section password=
assume password will not contain ampersand sign for sake of simplicity
to make it more real it has non ASCII characters
"password=" and "user" will occur only once
empty passwords are not validated but best solutions take empty passwords into account

Example:

input

jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345

output

jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****
BEST SOLUTION?:
return Regex("(?<=password=)[^&]*").replace(url) { "*".repeat(it.value.length) }
*/