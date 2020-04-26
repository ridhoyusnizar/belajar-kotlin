fun main() {
    var firstName : String = "Muhammad"
    var lastName : String = "Ridho Yusnizar"
    var address : String = """
        |Jalan Beruang Madu,
        |Kabupaten Beruang,
        |Kota Madu
    """.trimMargin()

    println(firstName)
    println(lastName)
    println(address)

    var fullName : String = "$firstName $lastName"
    var desc : String = "$fullName length = ${fullName.length}"
    println(desc)
    print(fullName)
}