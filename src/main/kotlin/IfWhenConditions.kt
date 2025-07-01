fun main() {
    val input = readln()
    val digit = input.toInt()

    val output = when(digit){
        null -> "Enter a valid number"
        4 -> "Number is 4"
        in 1..10 -> "within range"
        else -> "Nothing"
    }

    println(output)




//    val num = readln()
//    val realNum = num.toIntOrNull()
//    if(realNum != null){ //single if
//        val ans = (realNum and 1 == 0)
//        if(ans){ //nested if
//            println("Is ${realNum} even  ? : Yes")
//        }
//        else
//            println("Is ${realNum} even  ? : NO")
//
//    }
//    else{
//        println("Enter a valid Input as --- ${num}  --- is not a Integer")
//    }
//
//    val str = readln()
//    val n = str.length
//    println(str[0])
}