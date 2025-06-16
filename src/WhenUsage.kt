
fun main(args : Array<String>){

    println("args is ${args[0]}")
    var grade : Int = (Math.random() * 10.0) .toInt();
    println("grade is $grade")
    var result = when(grade){
        10 -> "Excellent"
        9 -> "Very good"
        8 -> "Good"
        7 -> "Average"
        6 -> "Pass"
        5 -> "Just pass"
        else -> {
            println("in default")
            "Fail"
        }
    }

    println("Result is $result")

}