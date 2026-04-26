fun main(args: Array<String>) {
    val myName: String = "Depandi Enda"
    for(chr in myName) {
        print(chr)
    }
    println('\n')

    val s = "abc" + 1
    println(s + "def")

    /*
    Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    raw String yang dipisahkan dengan triple quotes (""").
    (Eksekusi ini kemudia kode selanjutnya)

    var text = """
        for (c in "foo")
        print(c)
    """
    println(text)
    */

    var text = """
            |Tell me and I forget.
            |Teach me and remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
    """.trimMargin()
    println(text)
}