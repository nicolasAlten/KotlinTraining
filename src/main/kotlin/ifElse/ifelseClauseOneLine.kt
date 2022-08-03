package ifElse

fun ifelseClauseOneLine(): String {
    val user : Boolean = false

    val catchValue : String = if(user) "user is set" else "else clause"
    return catchValue

}