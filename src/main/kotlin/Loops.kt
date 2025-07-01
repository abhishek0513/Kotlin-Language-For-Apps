fun main(){

    val amountofNumbers = readln().toIntOrNull()?:0
    var sum = 0;
    var i = 0
    if(amountofNumbers > 0) {
        while(i < amountofNumbers) {
            val input = readln().toIntOrNull() ?: 0
            sum += input
            i +=1
        }
    }
    else{
        println("Idiot")
    }
    println(sum)
}