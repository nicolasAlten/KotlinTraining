package doWhile

fun whileFunction() {
    var i = 0

    while(i < 5){
        println("value is equalt to $i")
        if(i == 3)
            continue
        i++
    }
}