package Errors

import Lists.ArrayOfFunction

fun errorHandler() {
    try {
        //trhowableObject()
        ArrayOfFunction()
    } catch(e: Error) {
        println("an error occurred $e")
    } finally {
        println("printed anyway")
    }
    

}