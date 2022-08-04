package objects

class GeneralClass(
    var user : String,
    var password: String,
    var jsonObject : DataObject?
) {
    /*var user: String = ""
    lateinit var password : String*/

    //constructor(user : String): (this.user = "")

    fun gneralFunc(){
        print("inside my general function")
        password = "pasword"
    }

    fun `printing Json Object`(){
        println(jsonObject?.menu?.soda)
    }
}