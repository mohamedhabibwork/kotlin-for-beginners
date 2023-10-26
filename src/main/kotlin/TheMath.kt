import java.lang.Math.pow
import kotlin.math.*


fun main() {
    var num1 = 10.2f
    val num2 = 5.2f
    // kotlin.math
    println("max: ${max(num1, num2)}")
    println("min: ${min(num1, num2)}")
    println("abs: ${abs(num1 - num2)}")
    println("sqrt: ${sqrt(num1.toDouble())}")
    println("cbrt: ${cbrt(num1.toDouble())}")
    println("pow: ${pow(num1.toDouble(), num2.toDouble())}")
    println("exp: ${exp(num1.toDouble())}")
    println("round: ${round(num1.toDouble())}")
    println("log10: ${log10(num1.toDouble())}")
    println("log2: ${log2(num1.toDouble())}")
    println("log: ${log(num1.toDouble(), 8.0)}")
    println("sin: ${sin(num1.toDouble())}")
    println("cos: ${cos(num1.toDouble())}")
    println("tan: ${tan(num1.toDouble())}")
    println("asin: ${asin(num1.toDouble())}")
    println("acos: ${acos(num1.toDouble())}")
    println("atan: ${atan(num1.toDouble())}")
    println("sinh: ${sinh(num1.toDouble())}")
    println("cosh: ${cosh(num1.toDouble())}")
    println("tanh: ${tanh(num1.toDouble())}")
    println("asinh: ${asinh(num1.toDouble())}")
    println("acosh: ${acosh(num1.toDouble())}")
    println("atanh: ${atanh(num1.toDouble())}")

}