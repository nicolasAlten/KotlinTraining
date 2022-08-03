package `for`

fun ForEachWithIndex() {
    val list =  listOf(1,2,3,4,5)

    list.forEachIndexed { i, abc ->
        println("index in $i and value = $abc")
    }
}