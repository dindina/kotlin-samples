@file:JvmName("CourseUtils")

@JvmField
var Companion: Course.Companion = TODO("initialize me")

data class Course(val id: Int, val name: String, var category: String)

{
    companion object{
        @JvmStatic
        fun printName2(name : String ="default"){
            println("name $name")
        }
    }
}


@JvmName("printName1")
@JvmOverloads
fun printName(name: String ="default"){
    println("name $name")
}

@JvmName("printNameNew")
fun printName1(name: String ="default"){
    println("name $name")
}
