/* Classes, objects and Instances */
/* Primary construction based classes */
class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 100) {

    var weapon: Weapon = Weapon("fist", 1)

    fun show() {
        println("""
            Name:  $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon: ${weapon.name}
            Damage: ${weapon.inflictDamage}
        """.trimIndent())
    }
}

fun main(args: Array<String>) {
    val player1 = Player("alphaguy4")
    println("Name: ${player1.name}")
    println("Lives: ${player1.lives}")
    println("Score: ${player1.score}")

    println()

    val player2 = Player("Edward", 6)
    player2.show()

    println()

    val player3 = Player("Kenway", 2, 1)
    player3.show()

    println()

    val player4 = Player("Shay", 1,2,3000)
    player4.show()


    println(player4.weapon.name.uppercase())
    println(player4.weapon.inflictDamage)

    val axe =  Weapon("axe", 24)
    player3.weapon = axe

    println(player3.weapon.name)
    println(player3.weapon.inflictDamage)

    axe.inflictDamage = 100

    println(axe.inflictDamage)
    println(player3.weapon.inflictDamage) //  by reference will be 100

}