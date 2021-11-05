package com.example.randpass


import java.lang.StringBuilder
import java.util.*

class Logic {
    fun randPassGen(passLength: Int): String {
        val sb = StringBuilder()
        val rand = Random(System.nanoTime())
        for (i in 0 until passLength) {
            sb.append((rand.nextInt((122-33)+1) + 33).toChar())
        }
        return sb.toString()
    }
}