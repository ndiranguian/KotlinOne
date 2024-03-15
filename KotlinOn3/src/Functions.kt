fun main(args: Array<String>) {
    println(birthdayGreeting("Rolex", 25, "Santy"))
    println(birthdayGreeting("Ian", 18, "Stacy"))
    println(rectangleArea(12.0, 18.0))
    println(circleArea(7.0, 3.142 ))
    println(calculateBMI(2, 60))
}
fun birthdayGreeting(name: String, age: Int, from: String):String{
    val a = "Happy birthday $name"
    val b = "You are $age years old"
    val c = "You are celebrated"
    val d = "Regards, from $from"
    return "$a\n$b\n$c\n$d"
}
fun rectangleArea(length: Double, width: Double):Double{
    return length*width
}
fun circleArea(radius: Double, pie: Double):Double{
    return pie*radius*radius
}
fun calculateBMI(height: Int, weight: Int):Int{
    return weight/(height*height)
}