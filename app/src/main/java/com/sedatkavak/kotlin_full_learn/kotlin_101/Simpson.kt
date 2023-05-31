package com.sedatkavak.kotlin_full_learn.kotlin_101

class Simpson(var name: String, var age: Int, var job: String, var weight: Int) {
    private var height = 0

    fun setHeight(num: Int) {
        if (num > 100) {
            height = num
        }
    }
}