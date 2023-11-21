package lesson2

fun main() {
    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11

    val buff = 20

    val bonusCrystals: Int = (crystalsWithoutBuff * buff) / 100
    val bonusIron: Int = (ironWithoutBuff * buff) / 100


    println(
        """
            | Bonus crystals: $bonusCrystals
            | Bonus iron: $bonusIron """
    )

}