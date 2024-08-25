open class Vehicle(val name: String)
{
    open fun commonFeatures(){
        println("I am travelling in $name")
    }
}

class CarWithoutSunRoof(name: String) : Vehicle(name)
{
    fun specialFeatures(){
        println("$name has 4 wheels")
    }
}

class CarWithSunRoof(name: String): Vehicle(name)
{
    fun specialFeatures(){
        println("$name has 4 wheels")
    }

    override fun commonFeatures(){
        super.commonFeatures()
        println("I am operating the sunroof in $name")
    }
}

class Bike(name: String) : Vehicle(name)
{
    fun specialFeatures(){
        println("\n$name has 2 wheels")
    }
}



fun main()
{
//    val wagonR = CarWithoutSunRoof("Wagon R")
//    wagonR.specialFeatures()
//    wagonR.commonFeatures()
//    val pulsar = Bike("Bajaj Pulsar 200NS")
//    pulsar.specialFeatures()
//    pulsar.commonFeatures()


    val audi = CarWithSunRoof("Audi A8")
    audi.commonFeatures()
}