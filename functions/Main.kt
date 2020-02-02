fun main(args: Array<String>) {

    println("\nInline function")
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("Add(4 + 3) : ${add(4, 3)}")


    println("\nNamed arguments")
    println("Add(num1 = 5, num2 = 4) : ${add(num1 = 5, num2 = 4)}")

    println("\nUnit (No return type) function")
    fun sayHi(name: String): Unit = println("Hi $name, have a good day")
    sayHi("Jaseem")

    println("\nMultiple return values")
    fun multipleRV(num1: Int, num2: Int): Pair<Int, Int> = Pair(num1 * 2, num2 * num2)
    var (val1, val2) = multipleRV(4,6)
    println("Value 1: $val1, Value 2: $val2")

    println("\nVar args")
    fun addAllArgs(vararg nums: Int): Int{
        var sum: Int = 0
        nums.forEach { num -> sum += num }
        return sum
    }
    println("(1,2,3,4,5) => ${addAllArgs(1,2,3,4,5)}")

    println("\nFunction literals")
    val multiply = { num1: Int, num2: Int -> num1 * num2}
    println("multiply(3 * 4) = ${multiply(3,4)}")

}