package doWhile

fun doWhile() {
    var i = 0


    do {
        println("value is equalt to $i")
        if(i == 2)
            continue
        i++
    }while(i < 5)
}