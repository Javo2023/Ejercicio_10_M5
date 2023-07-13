package com.example.ejercicio_10_m5

open class Phone ( var isScreenLightOn : Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    fun switchOff(){
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight(){
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen light is: $phoneScreenLight.")
    }

}