const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"
fun main() {
    var yes = 'y'
    var x = "Beruang"
    val firstPick = "Bruno"

    println(firstPick)
    println(x)
    x = "Madu"
    println(x)


    //MEMBUAT FUNCTION NULL
    var firstName: String? = "Budi"
    firstName = null

    //error
    println(firstName)

    //berhasil
    println(firstName?.length)

    println("$APPLICATION $VERSION")
}