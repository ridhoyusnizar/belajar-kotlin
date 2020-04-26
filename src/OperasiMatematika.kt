fun main() {
    var a = 10 / 2
    var b = 1 + 2
    var c = 3 - 1
    var d = 10 % 4


    println(a)
    println(b)
    println(c)
    println(d)

    //Operasi Augmented Assignments
    var total = 0
    val barang1 = 100
    total = total + barang1

    val barang2 = 200
    total+= barang2

    val barang3 = 300
    total+= barang3
    println(total)

    //Unary Operation
    total++
    println(total)
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}