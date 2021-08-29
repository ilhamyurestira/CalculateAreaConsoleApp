package shape

class Rectangle(private val length: Int, val width: Int) : Shape() {
    init {
        shapeName = "Rectangle"
    }

    override fun calculateArea(): Double {
        return (length * width.toDouble())
    }

    override fun calculateCircular(): Double {
        return (2 * (length + width).toDouble())
    }

}