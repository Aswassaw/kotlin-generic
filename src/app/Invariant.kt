package app

class Invariant<WOLF>(val data: WOLF)

fun main() {
    val invariantString = Invariant("String")
    val invariantAny = invariantString
}