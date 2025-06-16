fun main(args : Array<String>) {

    var ar = IntArray(5)

    for( i in 2..10 step 2){
        ar[i/2 -1] = i
    }

    println(ar.size)




}