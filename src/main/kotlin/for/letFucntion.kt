package `for`

class User {
    var name : String = "user name"
    var password : String = "password"
    //var address : Address = Address()
    var address : Address? = null
}

class Address {
    var street : String = "Street"
    var number: Int = 123
}

fun letFunction() {
    val user : User = User()

    user.let{
        println(it.name)
    }

    /*user.address.let{
        println(it.street)
    }*/

    user.address?.let{
        println(it.street)
    } ?: print("no street found")

    user.address?.let{
        println(it.street)
    } ?: throw IllegalArgumentException("some error")

}