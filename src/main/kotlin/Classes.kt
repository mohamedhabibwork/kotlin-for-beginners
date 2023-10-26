fun main() {
    val tv = SmartDevice(
        brand = "Apple",
        price = 20000.0,
    )
    tv.turnOn()
    tv.turnOff()
    tv.togglePowerButton()
    tv.togglePowerButton()
    tv.reboot()

    val phone = SmartDevice(
        brand = "Apple",
        price = 20000.0,
    )
    phone.turnOn()
    phone.turnOff()
    phone.togglePowerButton()
    phone.togglePowerButton()
    phone.reboot()

    println(tv.toString())
    println(phone.toString())
    println("== ${tv == phone}")
    println("=== memory location check ${tv === phone}")
}


class SmartDevice(
    private var brand:String?,
    private var price:Double?,
    private var isTurnedOn: Boolean = false
){
    constructor(brand: String?, price: Double?): this(brand, price, false)

    // Properties, Fields, Global Variables
    // behaviors, actions, functions
//    var isTurnedOn = status
//    var brand = brand
//        set(value) {
//            field = value.uppercase()
//        }
//    var price = price
//        set(value) {
//            field = if (value < 0) 0.0 else value
//        }
    fun togglePowerButton() {
        isTurnedOn = !isTurnedOn
        println("$brand power button is toggled to $isTurnedOn $price")
    }
    fun turnOn() {
        this.isTurnedOn = true
        println("$brand turning on... $price")
    }
    fun turnOff() {
        this.isTurnedOn = false
        println("$brand turning off... $price")
    }
    fun reboot() {
        this.isTurnedOn = true
        println("$brand rebooting... $price")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isTurnedOn=$isTurnedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true // check if the same object in memory
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isTurnedOn != other.isTurnedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isTurnedOn.hashCode()
        return result
    }



}