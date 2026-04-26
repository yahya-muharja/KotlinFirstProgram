fun main(args: Array<String>) {
    val minByte: Byte = -128
    val maxByte: Byte = 127
    val minShort: Short = -32768
    val maxShort: Short = 32767
    val minInt: Int = -2_147_483_648
    val maxInt: Int = 2_147_483_647
    val minLong: Long = -922_337_203_685_475_807
    val maxLong: Long = 922_337_203_685_475_807

    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.123456789

    println("minByte " + minByte)
    println("maxByte " + maxByte)
    println("minShort " + minShort)
    println("maxShort " + maxShort)
    println("minInt " + minInt)
    println("maxInt " + maxInt)
    println("minLong " + minLong)
    println("maxLong " + maxLong)

    println("maxFloat " + maxFloat)
    println("maxDouble " + maxDouble)

    /* Jika nilai setiap tipe data diubah ke batas maksimal maka
    akan terjadi error, bakal disuruh change atau convert tipe */
}