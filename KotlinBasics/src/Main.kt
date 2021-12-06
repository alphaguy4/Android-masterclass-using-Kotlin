fun main(args: Array<String>) {
    println("Hello World!")

    // Variable types, arithmetics
    val name = "Kartikay Singh"
    println("Name: $name")

    val daily: Int = 50
    val monthly: Int = daily * 30
    println("Salary: ₹$monthly.")

    val apples: Int = 6
    val oranges: Int = 5
    val total = apples + oranges
    println("$apples apples + $oranges oranges = $total fruit(s)")

    val weeks: Int = 130
    val years: Double = weeks / 52.0

    println(years)

    // String operations
    println("$weeks weeks means $years years")
    println("Quarter of total $apples apples is ${apples / 4.0}")
}