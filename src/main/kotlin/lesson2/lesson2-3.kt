package lesson2

fun main(){
    val totalTravelTimeInMinutes = 457
    val departureHours = 9
    val departureMinutes = 39

    val travelTimeInHours = totalTravelTimeInMinutes / 60
    val travelTimeInMinutes =  totalTravelTimeInMinutes % 60

    val arriveHours = departureHours + travelTimeInHours
    val arriveMinutes = departureMinutes + travelTimeInMinutes

    println(" time of arrival $arriveHours:$arriveMinutes")

}