package com.zytronium.a3x1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.os.Handler
//import android.os.Looper
//import android.widget.TextView
//import java.util.*

class MainActivity : AppCompatActivity() {
//    private lateinit var text: TextView
    private var x: Int = 1
    private var checkNum: Int = 1
    private var checkedNums:IntArray = intArrayOf()
    private var tempNums:IntArray = intArrayOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        text = findViewById(R.id.tv)
//        text.text = checkedNums.toString()

//        val handler = Handler(Looper.getMainLooper())
//        handler.postDelayed({
            the()
//        }, (250).toLong())

//        updateText()

    }

//    private fun updateText() {
//        val handler = Handler(Looper.getMainLooper())
//        text.text = checkedNums.toString()
//        for(element in checkedNums) {
//            println(" $element,")
//        }
//
//        handler.postDelayed({
//            updateText()
//        }, (1500).toLong())
//    }
////    fun main(args: Array<String>) {
//
//        val reader = Scanner(System.`in`)
//
//        print("Enter a number: ")
//        val num = reader.nextInt()
//
//        if (num % 2 == 0)
//            println("$num is even")
//        else
//            println("$num is odd")
//    }

    private fun the() {
//        val handler = Handler(Looper.getMainLooper())
        if(!(checkedNums.contains(x))) {
            tempNums = addElement(tempNums, x)
            if(x % 2 == 0) {
                println("$x is even")
                x /= 2
                    the()
            } else
                println("$x is odd")
            if(x != 1) {
                x *= 3
                x++
                    the()
            } else {
                println("$checkNum leads to 1.\n\n Restarting sequence...")
                tempNums.forEach { i: Int -> checkedNums = addElement(checkedNums, i) }
                tempNums = intArrayOf()
                checkNum++
                x = checkNum
//                handler.postDelayed({
                    the()
//                }, (50).toLong())
            }
        } else {
            println("$checkNum probably leads to 1. \nRestarting sequence...")
            tempNums.forEach { i: Int -> checkedNums = addElement(checkedNums, i) }
            tempNums = intArrayOf()
            checkNum++
            x = checkNum
//            handler.postDelayed({
                the()
//            }, (50).toLong())
        }
    }

    private fun addElement(arr: IntArray, element: Int): IntArray {
        val mutableArray = arr.toMutableList()
        mutableArray.add(element)
        return mutableArray.toIntArray()
    }

}