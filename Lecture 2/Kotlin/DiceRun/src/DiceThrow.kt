fun main()
{
    println("\nHello User enter your name: \\")
    val name = readlnOrNull()
    println("Welcome to dice roll simulation user $name")
    Thread.sleep(1000)
    println("\nReady for dice roll? (Yes/n)")

    var choice = readlnOrNull()
    while (true){
        if (choice != null) {
            if(choice.lowercase()== "yes") {
                val diceRoll = (1..6).random()
                Thread.sleep(1000)
                println("\nYou Got $diceRoll")
            } else{
                println("\nThanks for playing with us.")
                break
            }
        }
        println("\nDo you want spin again? (Yes/n)")
        choice = readlnOrNull()
    }

}
