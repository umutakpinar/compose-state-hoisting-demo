package com.umutakpinar.composedemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainScreen1(){
    Column(modifier= Modifier
        .fillMaxSize(1f)
        .background(Color.DarkGray),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment= Alignment.CenterHorizontally
    ){
        var text= remember{ mutableStateOf("") }
        TextField(value=text.value,onValueChange={
            text.value=it
            println(text.value)
        })
    }
}
