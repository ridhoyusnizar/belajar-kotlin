fun main() {
    val members: Array<String> = arrayOf("Budi", "Bagus", "Bagas")

    //operasi array
    //size = panjang array

    //get(index) mendapat data array di posisi index

    //[index] mendapat data di posisi index

    //set(index,value) mengubah data di posisi index

    //[index] = value mengubah data di posisi index
    members[0] = "Mola"
    println(members[0])

    val nilai: Array<Int> = arrayOf(1,2,3)
    println(nilai[0])
    println(nilai[1])

    // membuat array null
    val pemain: Array<String?> = arrayOfNulls(5)
    pemain[0] = "Budi"
    pemain.set(1,"Babel")
    println(pemain[0])
    println(pemain[1])
}