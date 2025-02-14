package com.example.mobilapplications2

class Fraction(val numerator: Double, val denominator: Double) : Any(){

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator == other.numerator * denominator / other.denominator) {
                return true
            }
        }
        return false
    }
}

fun main(){

    val f1 = Fraction(1.0,2.0)
    val f2 = Fraction(2.0,4.0)
    println(f1==f2)
    println(f1)
    println(f2)
//    f1.equals(f2)
}