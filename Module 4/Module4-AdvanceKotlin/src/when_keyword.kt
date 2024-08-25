fun main() {
    val number = 21
    when(number) {
        in 1..10 -> println("$number is in 1-10 range")
        in 11..20 -> println("$number is in 11-20 range")
        in 21..30 -> println("$number is in 21-30 range")
        else -> println("$number is greater than 30")
    }
}
