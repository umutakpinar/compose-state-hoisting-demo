package com.umutakpinar.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.umutakpinar.composedemo.ui.theme.ComposeDemoTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MainScreen()
        }
    }

}
@Composable
fun MainScreen(){
    //STATE HOISTING
    val myString = remember{ mutableStateOf("Test") }

    Surface(modifier = Modifier.fillMaxSize(1f)) {
        Column {
            TextFieldMaker(myString = myString.value){
                myString.value = it
                println("string cahnged : ${myString.value}")
            }
        }
    }
}


@Composable
fun TextFieldMaker(myString : String, function : (string : String) -> Unit){
    //var myString = remember { mutableStateOf("Test") }
    TextField(value = myString, onValueChange = function)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        MainScreen()
    }
}
