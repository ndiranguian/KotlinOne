fun main(args: Array<String>) {
    val height:Int
    val weight:Int
    height=25
    weight=70
    val BMI:Int
    BMI=(weight/(height*height))
    println(BMI)
    if (BMI<18){
        println("You are underweight")
    }
    if (BMI>18){
            println("You are average and normal")
    }
    if (BMI>25){
        print("You are overweight")
    }
    if (BMI>30){
        println("You are Obese")
    }
}
