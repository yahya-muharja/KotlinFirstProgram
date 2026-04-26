fun main(args: Array<String>) {
    /* Terdapat 2 type system dalam variabel yaitu statis dan dinamis. Tipe system yang dinamis tidak
    memerlukan adanya deklarasi tipe data pada sebuah variabel, compiler secara otomatis akan
    mengenali tipe data dari sebuah variabel berdasarkan nilai yang diberikan kepadanya */
    var dynamicVar = 2
    println("Contoh dynamic variabel = " + dynamicVar)

    /*
    Sebaliknya tipe system yang statis mengharuskan kita mendeklarasikan jenis tipe data tertentu
    dalam sebuah variabel dan tipe data tersebut tidak bisa diubah selama program dieksekusi.
     */
    var staticVar: Char = 'A'
    println("Contoh static variabel = " + staticVar)

    //staticVar = 34 > error
}