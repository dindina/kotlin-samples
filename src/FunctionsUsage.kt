import java.util.Date

fun main(args: Array<String>) {

    println(square(5))
    println(square2(59))

    printDate()

    display('*',5, true)
    display('%',3)
    display('#')

    // named arguments

    println("named arguments")
    display('*',5, true)
    display('%',flag = true)
    display('#')

}

fun square(num : Int) : Int{
    return num*num;
}
// omit the return if the function has only one expression
fun square2(num : Int) = num*num

fun printDate(){
    println(Date().toString())
}

fun display(sign: Char , amount :Int =1 , flag : Boolean = false){

    if(flag){
        for ( i in 1 ..amount){
            print(sign)
        }
        println();
    }
}


