package app

class Covariant<out DRAGON>(val data: DRAGON) {
    fun sayHello(): DRAGON {
        return data
    }
}

fun main() {
    val covariantString = Covariant("Manusia")
    val covariantAny: Covariant<Any> = covariantString
}