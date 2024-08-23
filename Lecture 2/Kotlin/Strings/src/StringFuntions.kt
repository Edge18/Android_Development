fun main()
{
    val str: String = "Hello World"

    //Length function

    val length: Int = str.length
    println("The length of \"${str}\" is $length")

    // Character at particular index
    val charIndex: Char = str.get(0)
    println("The character at 1st position is: $charIndex")

    // Substring
    val subString: String = str.substring(6, 11)
    println("The substring from 6th to 11th position is: $subString")

    // Changing cases
    println("Uppercase: ${str.uppercase()}")
    println("Lowercase: ${str.lowercase()}")

    //Trim function
    val strWithSpace = "           Hello World  "
    println("Trimmed String :${strWithSpace.trim()}")

    //contains function
    val containString = "Do you think this  string contains Hello or not"
    println("Do you think it contains Hello:  ${containString.contains("Hello")}")

    // Replace
    val replaceStr = str.replace('o', 'O')
    println("The replaced string is $replaceStr")

    //Split function
    val splitFunction = str.split(" ")
    println("Substrings are after splitting are : $splitFunction")
}
