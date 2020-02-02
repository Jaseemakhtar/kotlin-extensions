fun main(args: Array<String>) {
    var arr: Array<Int> = arrayOf(2,4,1,5,6,9,7,8)
    var multiplyBy2 = {num : Int -> num * 2}
    listAndDoOperation(arr, multiplyBy2)
}

fun listAndDoOperation(arr: Array<Int>, myFunc: (num: Int) -> Int){
    for (num in arr){
        println("numbers: ${myFunc(num)}")
    }
}