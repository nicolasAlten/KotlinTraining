package `for`

fun ForEachWithBreakPointer() {

    val list =  listOf(1,2,3,4,5)

    /*list.forEach loop@{
        if(it == 2) return@loop
        println("index in $it")
    }*/

    list.forEachIndexed { i, it ->
        if(it == 2) return@forEachIndexed
        println("index in $it")
    }
}