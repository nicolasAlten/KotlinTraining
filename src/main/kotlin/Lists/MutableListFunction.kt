package Lists

fun MutableListFunction() {
    val list = mutableListOf(1,2,3,4)

    list.add(5)
    list.remove(1)
    list.removeAt(0)

    list.forEach { print("$it ") }
}