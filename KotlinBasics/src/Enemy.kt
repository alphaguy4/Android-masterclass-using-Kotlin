open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage;
        if(remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took hit of $damage, has $hitPoints left")
        } else {
            lives -= 1;
            if(lives > 0) {
                println("Lost a life, Lives = $lives")
            } else {
                println("$name is dead. Game over!!")
            }
        }
    }

    override fun toString(): String {
        return """
            Name: $name,
            Hitpoints: $hitPoints,
            Lives: $lives
        """.trimIndent()
    }

}