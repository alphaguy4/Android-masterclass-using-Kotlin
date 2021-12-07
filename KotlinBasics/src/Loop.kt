fun main(args: Array<String>) {
    // 1 <= i <= 20
    for(i in 1..20) {
        print("=")
    }
    println()

    // 0 <= i < 10
    for(i in 0 until 10) {
        print("$i ")
    }
    println()

    //  i = 10, i >= 0
    for(i in 10 downTo 0) {
        print("$i ")
    }
    println()

    // skips 2 numbers
    for(i in 10 downTo 0 step 2) {
        print("$i ")
    }

    println()

    // create a for loop that prints number divisible by 3 and 5 both
    // Easy way
    for(num in 1..100) {
        if(num % 3 == 0 || num % 5 == 0) {
            print("$num ")
        }
    }
    println()

    // Kotlin's way, efficient way
    for(num in 3..100 step 3) {
        print("$num ")
    }
    println()
}