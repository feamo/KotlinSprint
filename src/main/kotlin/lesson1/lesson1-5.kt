package lesson1

fun main() {
    val totalSeconds = 5678

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    val timeInSpace = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println("Время, проведенное в космосе: $timeInSpace")

}