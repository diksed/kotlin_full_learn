package com.sedatkavak.kotlin_full_learn.oop

class Piano(override var roomName: String?) : HouseDecor, Instrument {
    var brand : String? = null
    var digital : Boolean? = null
}