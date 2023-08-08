package com.itcast.kotlinproject

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        testArray()
//        testCollection()
        testClass()
    }

    /**
     * 类练习
     */
    private fun testClass() {
        val stu=Student()
        stu.name="张三"
        stu.age=10
        println(stu.name)
        println(stu.age)

        val car=Car("大众",120)
        println(car.name)

        val stu2=Student()
        stu2.action()
    }

    /**
     * 框架练习
     */
    private fun testCollection() {
        val a= listOf("hello","android")
        println(a[0])

        val b= mapOf("china" to "beijing","briton" to "london")
        println(b["china"])

        // TODO: list和mutableList的区别
        val c= mutableListOf("1","2","3")
        c.add("4")
        println(c.size)
    }

    /**
     * 数组练习
     */
    private fun testArray() {
        val a= intArrayOf(1,2,3)
        println(a[0])

        val b= arrayOf("hello","Android")
        b.forEach {
            println(it)
        }

        for(item in b){
            println(item)
        }
    }
}
