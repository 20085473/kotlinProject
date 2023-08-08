package com.itcast.kotlinproject

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.itcast.kotlinproject.ui.theme.KotlinProjectTheme

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testArray()
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
