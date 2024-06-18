package app

class TypeErasure<T>(val param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure<String>("Andry")
    val dataString: String = data.getData()

    val data2:TypeErasure<Int> = data as TypeErasure<Int>
}