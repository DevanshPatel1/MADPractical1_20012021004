fun main(){
    println("Create Array-1 by using arrayof() method:")
    val Arr1 = arrayOf(10, 90, 60, 80, 100)
    println(Arr1)
    println("Create Array-2 by using Array<>():")
    var Arr2 = arrayOf<Int>(0,0,0,0,0)
    println(Arr2)
    println("Create Array-3 by using Array<>() and lambda function:")
    println("Create Array-4 by using intArray():")
    println("Create Array-5 by using intArrayof():")
    var Arr5: IntArray = intArrayOf(5,10,15,20)
    println(Arr5)
    println("Please enter Array Value:")
    var a: Int = 5
    var Arr6 = readLine()!!.toInt()
}