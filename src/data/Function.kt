package data

class Function(val name: String) {
    fun <MOON> sayHello(param: MOON) {
        println("Hello $param, my name is $name")
    }
}