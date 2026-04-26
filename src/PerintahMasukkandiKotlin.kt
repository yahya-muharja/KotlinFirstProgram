fun main(args: Array<String>) {
    //Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!. Secara default perintah masukkan di Kotlin akan mengembalikan nilai String ke dalam variabel penampung.
    /*
    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
    */

    println("Enter a number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt()
    a = a * 2
    println(a)

    println("Enter a number, and I'll square it: ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}