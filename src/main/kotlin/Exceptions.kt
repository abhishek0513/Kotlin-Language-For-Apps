fun main() {
    val input = readln()
//    throw Exception("Dude, wrong input")
    val digit = try{
        input.toInt()
    }
    catch (e: NumberFormatException){
        0
    }

    val output = when(digit){
//        null -> "Enter a valid number"
        4 -> "Number is 4"
        in 1..10 -> "within range"
        else -> "Nothing"
    }

    println(output)
}