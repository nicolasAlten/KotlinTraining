package Variables

class CastingVariables {
    fun casting(){
        var userString :    String =   "user"
        var userInt  :      Int =        123
        var userChar :      Char =       'C'

        userString.toString()
        userInt.toByte()
        userChar.toChar()

        var newCastingVar : String = userInt as String
    }
}