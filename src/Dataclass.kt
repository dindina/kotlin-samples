data class Employee(var eno:Int , var name:String )
fun main(){
    var emp1 = Employee(1,"dinesh")
    println(emp1)
    var emp2 = Employee(1,"dinesh")
    println(emp2)
    var emp3 = Employee(1,"dinesh1")
    println(emp3)

    if(emp1 == emp2){
        println("equal")
    }else
    {
        println("not equal")
    }


    if(emp1 == emp3){
        println("equal")
    }else
    {
        println("not equal")
    }

    var emp4 = emp1.copy()
    println(emp4)

}