package src.extensionFunction

fun <Int> ArrayList<Int>.myFilter(predicate: (Int, Int, Int)-> Boolean, param1: Int, param2: Int): ArrayList<Int>{

    val filteredList = arrayListOf<Int>()
    this.forEach {
        if(predicate(it, param1, param2))
            filteredList.add(it)

    }
    return filteredList
}

fun main() {
    var myArray = arrayListOf(12, 10, 4, 7, 8, 2, 3, 5)
    var condition: (Int, Int, Int) -> Boolean = {num: Int, x: Int, y: Int ->
        num > x && num < y
    }

    var filtered = myArray.myFilter(condition, 2, 7)
    filtered.forEach { println(it) }
}