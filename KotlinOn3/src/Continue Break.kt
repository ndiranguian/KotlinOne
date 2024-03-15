fun main(args: Array<String>) {
    for (n in 1..10){
        println("before continue, loop: $n")
        if (n==2||n==5)
            continue
        println("after continue, loop: $n")
    }
    //break
    for (n in 1..5){
        println("before break, loop: $n")
        if (n==5){
            println("Iam terminating the loop...")
        }
    }
    for (n in 'A'..'P'){}
}