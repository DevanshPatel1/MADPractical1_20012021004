fun main(){
    print("Enter Number: ")
    var num = readLine()!!.toInt()

    if(num%2==0){
        println("$num is even")
    } else{
        println("$num is odd")
    }
}