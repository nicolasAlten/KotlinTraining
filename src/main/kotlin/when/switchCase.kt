package `when`

fun switchCase() {
    val user: Int = 2

    when(user) {
        1 -> print("user is 1")
        2 -> print("user is 2")
        3 -> print("user is 3")
        4 -> print("user is 4")
        5 -> print("user is 5")
        else -> "in else"
    }
}