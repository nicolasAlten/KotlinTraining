package `when`

fun switchCaseWithValue() : String {
    val user: Int = 2

    val userResult = when(user) {
        1 -> "user is 1"
        2 -> "user is 2"
        3 -> "user is 3"
        4 -> "user is 4"
        5 -> "user is 5"
        else -> "in else"
    }

    return userResult
}