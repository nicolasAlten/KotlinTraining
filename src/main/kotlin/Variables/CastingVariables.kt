package Variables

fun casting(){
    val userString :    String =   "user"
    val userInt  :      Int =        123
    val userChar :      Char =       'C'

    userString.toString()
    userInt.toByte()
    userChar.toChar()

    val newCastingVar : String = userInt.toString()

    println("userString ===> $userString")
    println("userInt ===> $userInt")
    println("newCastingVar ===> $newCastingVar")
}
