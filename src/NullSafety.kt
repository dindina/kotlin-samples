fun main() {
    var s = "dinesh"

    //Null cannot be a value of a non-null type 'String'.
    //s = null // not allowed

    var s2 : String ? = "dinesh" // null is allowed
    s2 = null // allowed
    //print(s2.length) // not allowed


    var len = s2?.length ?: -1
    println(len)




}