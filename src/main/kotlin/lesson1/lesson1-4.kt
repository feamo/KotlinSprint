package lesson1

fun main() {
    val length: Long = 40868600000
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println(
        """
        |$length
        |$age
        |$partOfDay 
        |$seconds
        |$partOfYear
        |$apogee
    """.trimMargin()
    )

}