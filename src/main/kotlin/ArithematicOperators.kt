import kotlin.math.abs

fun arithematicPlus(n :Int, m :Int):Int
{
    return n+m
}
fun arithematicSub(n :Int, m :Int):Int
{
    return n-m
}fun arithematicAbsSub(n :Int, m :Int):Int
{
    return abs(m-n)
}fun arithematicMultiply(n :Int, m :Int):Int
{
    return n*m
}
fun arithematicDevide(n :Int, m :Int): Double
{
    return (n/m).toDouble()
}
fun arithmeticRemainder(n :Int, m :Int):Int
{
    return n%m
}
fun comparision(n : Int, m:Int):Boolean
{
    return n ==m
}

//Logical Operators "and" and "or"
fun main(){
    println(arithematicPlus(5,2))
    println(arithematicSub(5,2))
    println(arithematicAbsSub(5,2))
    println(arithematicMultiply(5,2))
    println(arithematicDevide(5,2))
    println(arithmeticRemainder(5,2))

    print(comparision(5,5))

    var n =  4
    println(n and 1)
}