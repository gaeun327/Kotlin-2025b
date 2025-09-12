package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week02Variables()
        week02Functions()
    }
}

fun week02Functions(){
    println("week02 functions")

//    fun greet(name : String ) = "hello, $name"
//
//    println(greet("android developer"))
    println("== Kotlin Function ==")
    fun greet(name: String): String{
        return "Hello, $name"

    }

    fun add(a:Int,b:Int)=a+b
    fun introduce(name : String,age : Int = 19){
        println("my name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum: ${add(5,-71)}")
    introduce("park")
    introduce("kim",29)

}
fun week02Variables(){
//    println("week02 variables")
//
//    val courseName = "Moblie Programming"
//    // courseName = "IoT Programming"
//    var week = 1
//    week = 2
//    // 변수 값을 바꾸는 게 가능함
//    println("Course : $courseName")
//    println("week : $week")\

    println("== Kotlin Variables ==")

//    val name : String = "Android"
    val name ="Androi"
    var version=8.1
    println("Hello $name $version")

    val age : Int = 23
    val height : Double = 177.7
    val isStudent : Boolean = false

    println("Age : $age, Height : $height, Student : $isStudent")



}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}