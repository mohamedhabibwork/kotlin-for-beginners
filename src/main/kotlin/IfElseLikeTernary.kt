fun main() {
    val n1 =7
    val n2 = 3

    val result = if (n1 > n2) ("n1 is greater than n2")
    else if (n1 < n2)  ("n1 is less than n2")
    else if (n1 >= n2) ("n1 is greater than or equal to n2")
    else ("n1 is equal to n2")


    println("result = $result")

}