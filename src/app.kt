fun main() {
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
println("Hola mundo")
otrafuncion()
println(sum(2,3))
println(sum2(a = 11,b = 2))
printSum(a,b)
    var x = 5
    x+=1
    var aa = 1
    val s1 = "aa is $aa"
    aa = 2
    val s2 = "${s1.replace("is", "was")}, but now is $aa"
println(maxOf(a,b))
println(maxOf2(a,b))
}

fun otrafuncion(){
println("Adios")
}
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b
fun printSum(a: Int, b: Int){
    println("sum of $a and $b is ${a + b}")
}
val PI = 3.14
var x = 0
fun incrementX() {
    x += 1
}
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun maxOf2(a: Int, b: Int) = if (a > b) a else b
