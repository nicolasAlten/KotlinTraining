package ifElse

fun ifElseCatch(): String {
    val user : Boolean = false

    val catchValue : String = if(user){
        "user is set"
    } else if(user == false) {
        "user is not set"
    } else {
        "else clause"
    }

    return catchValue
}