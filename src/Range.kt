fun main() {
    val range = 1.. 1000
    val range1 = 100 downTo 1 step 2
    println(range1)
    //operasi range
    //count() total data di range
    println(range1.count())
    //contains() mengecek apakah terdapat value pada range
    println(range1.contains(200))
    println(range1.contains(1500))
    //first() mendapatkan nilai pertama
    println(range1.first)
    //last() mendapatkan nilai terakhir
    println(range1.last)
    //step() mendapatkan nilai tiap kenaikan
    println(range1.step)
}