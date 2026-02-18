package com.example.jogododado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogododado.ui.theme.JogoDoDadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JogoDoDadoTheme {
                JogarDado(modifier = Modifier.fillMaxSize())
            }
        }
    }
}
@Composable
fun JogarDado(modifier: Modifier = Modifier){

    var result by remember {
        mutableStateOf(1)
    }
    var result1 by remember {
        mutableStateOf(1)
    }
    var imageResult = when(result){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6

    }
    var imageResult1 = when(result1){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6

    }
    var ColorAleatorioa = when(result){
        1 -> Color.LightGray
        2 -> Color.Cyan
        3 -> Color.Yellow
        4 -> Color.Green
        5 -> Color.Magenta
        else -> Color.Red
    }

    var soma = result + result1
    var total by remember {
        mutableStateOf(0)
    }


   Surface(    modifier = Modifier.fillMaxSize(),
                color = ColorAleatorioa
   ) {
   }
    Column(
        modifier = modifier,
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row (){


            Image(
                painter = painterResource(imageResult),
                contentDescription = "dado"
            )
            Image(
                painter = painterResource(imageResult1),
                contentDescription = "dado"
            )
            Spacer(
                modifier = Modifier.height(20.dp)
            )



        }
        Text(text = "Soma:$soma",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { result = (1..6).random()
                           result1 = (1..6).random()
                           total += result + result1;

        }
        )


        {
            Text(text = stringResource(R.string.rolar)
            )
        }
    Spacer(modifier = Modifier.height(20.dp))

        Text(text ="Total $total",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { total = 0 }) {
            Text(text = "Reset")
        }
    }
}


