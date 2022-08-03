package `when`

fun whenAsFlag() {
    val user: Int = 2

    when(user) {
        is Int -> {
            print("is an integer")
        }
    }
}