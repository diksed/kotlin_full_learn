package com.sedatkavak.kotlin_full_learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //integer()
        //doubleFloat()
        //string()
        //boolean()
        //conversion()
        //collections()
        //operators()
        //ifElse()
        switchWhen()
    }
}

fun integer(){
    // Integer
    var x = 5
    var y = 4

    var age = 35
    val result = age / 7 * 5
    println(result)

    // Defining
    var myInteger : Int

    // Initialize
    myInteger = 10
    myInteger = 20

    val a : Int = 23
    println(a / 2)

    var myLong : Long = 100
}
fun doubleFloat(){
    // Double
    val pi = 3.14

    // Float
    val myFloat = 3.14f

    var myAge : Double
    myAge = 22.0
}
fun string(){
    val myString = "Sedat Kavak"
    val name = "Sedat"
    val surname = "Kavak"
    val fullname = name + " " + surname
    println(fullname)

    val larsName : String = "Lars"
}
fun boolean(){
    var myBoolean : Boolean = true
    myBoolean = false
    var isAlive = true

    println(3<5)
    println(3>5)
    println(3 == 3)
    println(4 != 5)
}
fun conversion(){
    var myNumber = 5
    var myLongNumber = myNumber.toLong()

    var input = "10"
    var inputInt = input.toInt()
    println(inputInt * 2)
}
fun collections(){
    // Arrays
    val myArray = arrayOf("Sedat","Kavak","Kotlin","Java")
    println(myArray[0])
    myArray[0] = "Ahmet"
    println(myArray[0])
    myArray.set(1,"Mehmet")
    println(myArray[1])
    val numberArray = arrayOf(1,2,3,4,5)
    val myNewArray = doubleArrayOf(1.0,2.0,3.0)
    val mixedArray = arrayOf("Sedat",1,true)
    println(mixedArray[0])
    println(mixedArray[1])


    // List - ArrayList
    val myMusician = arrayListOf<String>("James","Kirk")
    myMusician.add("Lars")
    println(myMusician[2])
    myMusician.add(0,"Rob")
    println(myMusician[0])

    val myArrayList = ArrayList<Int>()
    myArrayList.add(1)
    myArrayList.add(200)
    val myMixedArrayList = ArrayList<Any>()
    myMixedArrayList.add("Sedat")
    myMixedArrayList.add(20.20)
    myMixedArrayList.add(true)

    println(myMixedArrayList[0])
    println(myMixedArrayList[1])
    println(myMixedArrayList[2])


    // Set
    val myExampleArray = arrayOf(1,1,2,3,4,5,5)
    println("element 1 : ${myExampleArray[0]}")
    println("element 2 : ${myExampleArray[1]}")

    val mySet = setOf<Int>(1,1,2,3)
    println(mySet.size)

    mySet.forEach { println("element : $it") }
    val myStringSet = hashSetOf<String>()
    myStringSet.add("Sedat")
    myStringSet.add("Sedat")
    println(myStringSet.size)


    // Map
    val fruitCalorieMap = hashMapOf<String,Int>()
    fruitCalorieMap.put("Apple",100)
    fruitCalorieMap.put("Banana",150)
    println(fruitCalorieMap["Apple"])
    println(fruitCalorieMap["Banana"])

    val myHashMap = HashMap<String,String>()
    val myNewHashMap = hashMapOf<String,Int>("A" to 1,"B" to 2)
    println(myNewHashMap["A"])

}
fun operators(){
    var m = 5
    m += 1
    println(m)
    m++
    println(m)
    m--
    println(m)
    var n = 7

    println(n > m)
    println(n > m && 3 > 1)
    println(n > m && 1 > 3)
}
fun ifElse(){
    val myAge = 32
    if (myAge < 30){
        println("You are young")
    }
    else if (myAge >= 30 && myAge < 40){
        println("You are in your 30s")
    }
    else{
        println("You are old")
    }
}
fun switchWhen(){
    val day = 6
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

}