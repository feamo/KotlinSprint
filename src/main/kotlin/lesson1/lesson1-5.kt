package lesson1

fun main(){
    val secondsCount: Int = 6480
    val secondsOnHour: Int = 3600
    var hoursInFlyght: Int = secondsCount / secondsOnHour
//    println(hoursInFlyght)

    val secondsInMinutesOfFlyght: Int = secondsCount % secondsOnHour
//    println(secondsInMinutesOfFlyght)

    val minuteInFlyght: Int = secondsInMinutesOfFlyght / 60
//    println(minuteInFlyght)

    val secondsInFlyght: Int = secondsCount % minuteInFlyght
    println(secondsInFlyght)

    println("Время в полете: $hoursInFlyght:$minuteInFlyght:$secondsInFlyght")

}