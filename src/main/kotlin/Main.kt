fun main() {
    val yearOfFlight: Int = 1961
    var hour = "09"
    var minute = "07"

    println("""
        |Полет Гагарина состоялся в $yearOfFlight году.
        |Время взлета $hour:$minute 
    """.trimMargin()
    )

    hour = "10"
    minute = "55"

    println("Время посадки $hour:$minute")

}
