class Car(type:String, model:String, owner:String, miles:Int, price:Int, cprice:Int){
    var ty:String = type
    var mo =model
    var ow = owner
    var m:Int = miles
    var p:Int = price
    var cp:Int = cprice

    fun getCarPrice(){
        println("Car Information: $ty , $mo\nCar Owner: $ow\nMiles Driven: $m\nOriginal Car Price: $p, Current Car Price: $cp ")
    }
}
fun main() {
    var cars = arrayOf(Car("BMW","2018","Dev",105,100000, 98950),
        Car("Ferrari","2019","Raj",20,400000, 399800),
        Car("Tata","2017","Nirnay",100,1080000, 1079000),
        Car("Honda", "2020", "Abhi", 200, 4000000, 3998000))
    println("Creating Car Class Object car1 in next line")
    println("Object of class is created and Init is called.\n-----")
    for (i in cars){
        i.getCarPrice()
    }
}