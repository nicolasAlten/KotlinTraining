package objects


abstract class AbstractObject{
    var user = "user"

    fun someLogic(){
        println("running business logic")
    }

    abstract fun displayUser()
}

class AbstractClassImpl() : AbstractObject() {
    override fun displayUser() {
        println("some logic inside")
    }

}