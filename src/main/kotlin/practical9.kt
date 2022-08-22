fun main() {
    val arr = arrayOf(57, 90, 10, 13, 14)
    val ints = arr.toList()
    for(index in arr){
        println("a[$arr]=$index")
    }
    println("Maximum: ${ints.max()}")
}