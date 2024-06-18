package app

import data.MyData

fun main() {
    val myDataString = MyData("Bambang", 100)
    myDataString.firstData
    myDataString.printData()
    myDataString.printData2()

    val myDataInteger = MyData(200, "Risky")
    myDataInteger.firstData
    myDataInteger.printData()
    myDataInteger.printData2()
}