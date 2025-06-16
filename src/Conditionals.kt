import kotlin.math.roundToInt


fun main(args : Array<String>) {

    val side1: Int = (Math.random() * 100.0).roundToInt()
    val side2: Int = (Math.random() * 100.0).roundToInt()
    val side3: Int = (Math.random() * 100.0).roundToInt()

    println(side1)
    println(side2)
    println(side3)

    var max : Int = Math.max(side1, side2).coerceAtLeast(side3)

    if(max == side1){
        println("side1 is max")
        if(side2+side3 < max) {
            println("invlaid")
            return
        }
    }
    if(max == side2){
        println("side2 is max")
        if(side1+side3 < max) {
            println("invlaid")
            return
        }
    }
    if(max == side3){
        println("side3 is max")
        if(side2+side1 < max){
            println("invlaid")
            return
        }
    }
    println("valid")

    // alternate logic
    val sumOfAllSides = side1 + side2 + side3

    // A triangle is valid if the sum of all sides is greater than twice the longest side.
    // This also implies that the sum of the two shorter sides is greater than the longest side.
    // (s1+s2+s3) > 2 * maxSide  <=> (s1+s2+s3 - maxSide) > maxSide
    if (sumOfAllSides > 2 * max) {
        println("Valid triangle")
    } else {
        println("Invalid triangle (sides: $side1, $side2, $side3; max: $max; sum: $sumOfAllSides)")
    }
}