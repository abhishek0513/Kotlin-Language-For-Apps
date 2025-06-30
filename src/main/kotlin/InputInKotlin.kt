fun main(){
    println("Enter the number you want tp check if is even or odd")
    var times = 3
    while(times-- != 0){
        var value = readln()
        println("is Even :: ${value.toInt() % 2 == 0}")

    }
}