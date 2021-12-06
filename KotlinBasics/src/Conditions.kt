fun main(args: Array<String>) {
    val lives = 2

    if(lives < 1) {
        println("Game Over!")
    } else {
        println("You are still alive ;-)")
    }

    var isGameOver = (lives < 1)
    if(isGameOver) {
        println("Game over !!")
    } else {
        println("Game ain't over yet.")
    }

    print("How old are you ?: ")
    val age = readLine()!!.toInt() // No type checking
    println("Age is $age")

    // Last line is the value assigned, return from if-else block
    val message: String = if(age < 18) {
        "You're too young to vote"
    } else {
        "Congratulions!! You can vote."
    }
    println(message)

    print("Enter month: ")
    val monthInt: Int = readLine()!!.toInt()
    val monthString: String = when(monthInt) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        else -> "Others"
    }
    println(monthString)
    if(monthString == "April") {
        println("Birthday Month xD")
    }
}