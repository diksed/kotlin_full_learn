package com.sedatkavak.kotlin_full_learn.kotlin_101.oop

class Piano(override var roomName: String?) : HouseDecor, Instrument {
    var brand : String? = null
    var digital : Boolean? = null
}