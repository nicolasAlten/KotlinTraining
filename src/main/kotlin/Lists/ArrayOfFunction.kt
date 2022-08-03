package Lists

fun ArrayOfFunction() {
    val list = arrayOf(1,2,3,4)

    println(list[0])
    list[1] = 6
    list.reverse()
    list.forEach { print("$it ") }

}