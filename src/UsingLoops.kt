
fun main(args : Array<String>){

    while(true){

        println("hello")
        val x: Int = (Math.random() * 10.0).toInt();
        println("x is $x")
        if( x == 5)
            break;
    }

    var name: String = "Dinesh"

    for( letter in name)
    {
        print(letter)
    }

    println("\n-------------------------")

    for ( index in name.indices){
        if(index %2 == 0)
        print(name[index])
    }
    println("\n-------------------------")

    for((index,letter) in name.withIndex()){
        print("$index : $letter,")
    }
    println("\n-------------------------")

    for ( i in 1..10){
        print("$i")
    }

    for ( i in 1..10 step 2){
        print("$i")
    }

    println("\n-------------------------")

    for ( c in 100 downTo 90){
        print("$c,")
    }

    println("\n-------------------------")

    for ( c in 'z' downTo  'a'){
        print("$c,")
    }


}