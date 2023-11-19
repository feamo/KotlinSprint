package lesson2

fun main(){
//    averageScore
    val totalEmployee = 50
    val totalTrainee = 30

    val salaryEmployee = 30000
    val salaryTrainee = 20000

    val totalCountSalaryEmployee = totalEmployee * salaryEmployee
    val totalCountSalary = (totalEmployee * salaryEmployee) + (totalTrainee * salaryTrainee)
    val averageSalary = totalCountSalary / (totalEmployee+totalTrainee)

    println( "totalCountSalaryEmployee: $totalCountSalaryEmployee, totalCountSalary: $totalCountSalary, averageSalary: $averageSalary")
}