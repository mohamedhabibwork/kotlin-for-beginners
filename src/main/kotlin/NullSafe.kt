fun main() {

    var name: String? = null
    var age: Int? = null
    var department: String? = null

    println("Name: ${name?.uppercase()}")
    println("Age: ${age?.toString()}")
    println("Department: ${department?.uppercase()}")

    name = "John"
    age = 30
    department = "IT"
    println("#############################################")
    println("Name: ${name?.uppercase()}")
    println("Age: ${age?.toString()}")
    println("Department: ${department?.uppercase()}")

}