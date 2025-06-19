fun main(){
    //exploreApply()
    //exploreAlso()
    //exploreLet()
    //exploreWith()
    exploreRun()
}

fun exploreApply(){

    var newCourse = Course(
        1,
        "java",
        "Tech"
    ).apply {
        category = "AI"
    }

    println("newCourse $newCourse")
}

fun exploreAlso(){

    var newCourse = Course(
        1,
        "java",
        "Tech"
    ).apply {
        category = "AI"
    }
        .also {
        println(it)
    }


}

fun exploreLet(){

    val numbers = mutableListOf(1,2,3,4,5)
    var result = numbers.map{it*2}.filter{it > 5}.let{
        println(it)
        it.sum()
    }
    println(result)

    var name :String? = null
    var upper = name?.let{
        println(it.uppercase())
        it.uppercase()
    }
    println(upper)
}

fun exploreWith(){
    var numbers = mutableListOf(1,2,3,4,5)
    with(numbers){
        var list = numbers.plus(6)
        println(numbers.sum())
        println(list.sum())
    }
}

fun exploreRun(){
    var numbers : MutableList<Int>? = null
    var result=    numbers.run{
        numbers = mutableListOf(1,2,3,4,5)
        println(numbers.sum())
        numbers
    }
    println(result)

    var ln = run{
        val name = "Dinesh"
        println(name)
        name.length
    }
    println(ln)
}





