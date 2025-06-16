fun main() {
    val f = {a:Int , b:Int -> a+b}

    println(f(2,3))


    var x : Int = f(2,3)+8;
    println(x)

    var list = listOf(1, 2, 3);

    var doubleList = list.stream().map { i -> i*2 }.toList();
    println(doubleList)




}