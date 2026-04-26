fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 65)
    //Tidak bisa diperlakukan secara langsung sebagai number

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.lowercaseChar())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " + strA)
}