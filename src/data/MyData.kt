package data

class MyData<HUMAN, ELF>(val firstData: HUMAN, val secondData: ELF) {
    fun getData(): HUMAN = firstData
    fun getData2(): ELF = secondData

    fun printData() {
        println("DATA is $firstData")
    }
    fun printData2() {
        println("DATA is $secondData")
    }
}