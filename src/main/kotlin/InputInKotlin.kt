fun main(){
    println("Enter the number you want tp check if is even or odd")
    var times = 3
//    while(times-- != 0){
//        val value = readln()
////        println("is Even :: ${value.toInt() and 1 == 0}")
//        println("is Even :: ${value.toIntOrNull()}")
//        //we simply use single "and" for '&' operation in kotlin similiar to c++
//
//    }


    //NUll and Nullability

    //?. is nullsafety operator
    val num = readln()
//    val numAsInteger = num.toIntOrNull()?: 0 //Assigin the default value if NULL
    val numAsInteger = num.toIntOrNull()?.rem(2)?.equals(0)
//    val isEven = numAsInteger!! and 1 == 0 //can be used on values that could be null

    println("Your Number $numAsInteger is even :: ${numAsInteger}")

}