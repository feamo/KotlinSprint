package lesson3

fun main(){
    val femaleName = "Татьяна"
    val femalePatronymic = "Сергеевна"
    val femaleSurnameBefore = "Андреева"
    val femaleSurnameAfter = "Сидорова"

    val femaleAgeBefore = 20
    val femaleAgeAfter = 22

    println("""
         $femaleSurnameBefore $femaleName $femalePatronymic, $femaleAgeBefore
         $femaleSurnameAfter $femaleName $femalePatronymic, $femaleAgeAfter
    """.trimIndent())

}