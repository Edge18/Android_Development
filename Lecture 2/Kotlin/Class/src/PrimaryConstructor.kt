class Cake(
    var flavour: String,
    var quantity: Int
){
    init {
        println("Primary Constructor was called! \n");
    }
    constructor(flavour: String): this(flavour, 0){
        println("Secondary Constructor was called! \n");
    }
}

fun main()
{
    val chocoCake = Cake("Chocolate")
    //val vanillaCake = Cake()

    println("\nYou have ordered ${chocoCake.flavour} cake")
}