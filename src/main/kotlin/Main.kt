fun main() {
println(names("Janet","atienojane@gmail.com","hope"))
var myCalculator = Calculator(20,5)
    var value = arrayOf(13,24,50,97,15,34)
    println(value)
    println(myCalculator.division(20,5))
    println(myCalculator.sum(20,5))
    println(myCalculator.multiplication(20,5))
    println(myCalculator.subtract(20,5))

}
fun values(num1:Int,num2:Int,num3:Int,num4:Int):Array<Int>{
    var value = arrayOf(13,24,50,97,15,34)
    return value



}
fun names(name1:String,name2:String,name3:String){
    var name = name1;name2;name3
}
fun city(cities1:String,cities2: String,cities3: String):Array<String>{
var cities= arrayOf("Nairobi","Mombasa","Nakuru")
    return cities
}
class Calculator( val num1: Int,val num2: Int){
    fun sum(num1: Int,num2: Int){
        var numbers = num1 + num2
    }
    fun subtract(num1: Int,num2: Int){
        var subtraction = num1 - num2
    }
    fun division(num1: Int,num2: Int){
        var devide = num1 / num2
    }
    fun multiplication(num1: Int,num2: Int){
        var multiply = num1 * num2
    }
}
