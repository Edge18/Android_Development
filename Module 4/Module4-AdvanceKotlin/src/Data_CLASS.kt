data class MyData(val name: String,val age: Int,val height: Int,val weight: Int)

fun main() {

//Write your code here
    val myPersonalData = MyData(
        name = "Biswajit",
        age = 23,
        height = 180,
        weight = 70
    )
    println("My details are: $myPersonalData")
}