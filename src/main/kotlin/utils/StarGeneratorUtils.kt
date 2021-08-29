package utils

class StarGeneratorUtils {
    fun printStars(totalStar: Int) {
        if (totalStar <= 20) {
            for (i in 0 until totalStar) {
                for (j in 0..i) {
                    print("*")
                }
                println()
            }
        } else {
            println("Total stars should not grater than 20")
        }
    }
}