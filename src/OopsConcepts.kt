class Circle constructor(var radius :Double){

    init{
        println("radius is $radius")

    }

    init {
        radius = if (radius <= 0) 1.0 else radius;
    }
    fun area() : Double {
        return Math.PI * radius * radius
    }

    fun circumference() : Double {
        return 2 * Math.PI * radius
    }


}

fun main() {
    var c = Circle(10.0);
    println(c.circumference())
    println(c.area())
}