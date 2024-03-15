fun main(args: Array<String>) {
    //containers that holds data sets
    var arr = arrayOf(10, "Faith", 23.4, 'A')//all data types
    var arr1= arrayOf<Int>(12, 232, 343, 454)//hosts integers only
    var arr2= arrayOf<String>("John", "Kube", "Esther")//hosts strings only

    println(arr[1])
    println(arr[3])

//modify an array using set function
    var fruits = arrayOf("banana", "Oranges", "Apples")
    fruits[1] = "Pineapple"
    for(fruit in fruits){
        println(fruit)
    }

}