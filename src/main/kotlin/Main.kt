fun main() {



var car=Car("Corolla","Lexus","Black",5)
car.carry(5)
car.carry(9)
car.identity()
var bus= Bus("Toyota","Scania","blue",60)
println(car.calculateParkingFees(4))
println(bus.maxTripFare(46.4))
println(bus.calculateParkingFees(4))



}
open class Car( var model:String, var make:String, var color: String,var capacity:Int){
    fun carry(people:Int){
        var x= capacity
        if (capacity>=people){
            println( "Carrying $people passangers")
        }
        else{
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open  fun calculateParkingFees(hours:Int):Int{
        var fees =hours*20
        return fees

    }

}
class Bus ( model: String, make:String, color: String, capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double {
        return fare * capacity

    }

    override fun calculateParkingFees(hours: Int): Int {
        // return super.calculateParkingFees(hours)
        var fees=hours*capacity
        return fees

    }


}
