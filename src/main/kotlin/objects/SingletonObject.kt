package objects

//@Data
open class SingletonObject(
    var name : String,
    var soda: String
) : InterfaceObject {
    fun printValues() {
        print("some info inside")
    }

    override fun run() : String {
        return "inside the business logic"
    }

    override fun printObject() {
        TODO("Not yet implemented")
    }
}