package Lists

fun EmptyListFunction() {
    val list1 = mutableListOf<Int>(1,2,3,4,5)
    val list2 = mutableListOf<Int>(1,3,4,5)

    val listOfVar = listOf<String>()
    val listWithNulls = arrayOfNulls<String>(2)

    /*listOfVar.forEach { print("$it ") }
    listWithNulls.forEach { print("$it ") }*/

    list1.zip(list2).forEach { pair ->
        run {
            if (pair.first == pair.second)
                print("both indexes contain the same value = $pair.first")
        }
    }

}