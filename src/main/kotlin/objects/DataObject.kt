package objects

data class DataObject(
    var user : String,
    var password: String,
    var menu: Menu
) {
}

data class Menu(
    var name : String,
    var soda: String
) {
}