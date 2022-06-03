package com.example.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeproject.ui.theme.JetpackComposeProjectTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
//                    Row
//                    Row(
//                        modifier = Modifier
//                            .height(500.dp)
//                            .width(500.dp)
//                            .background(Color.LightGray),
//                        horizontalArrangement = Arrangement.Start,
//                    ) {
//                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
//                        CustomItem(weight = 1f)
//                    }


//                    Text Customization
//                    Column(modifier = Modifier.fillMaxSize()) {
//                        Text(
//                            text = stringResource(id = R.string.app_name), modifier = Modifier
//                                .background(MaterialTheme.colors.primary)
//                                .padding(16.dp)
//                        )
//                    }

                    CustomText()
                }
            }
        }
    }
}

//@Composable
//fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
//    Surface(
//        modifier = Modifier
//            .width(50.dp).height(50.dp)
//            .weight(weight),
//        color = color
//    ) { }
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeProjectTheme {
//        Row(
//            modifier = Modifier.fillMaxSize(),
//            horizontalArrangement = Arrangement.Start,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
//            CustomItem(weight = 1f)
//        }

//        Greeting()


//        Text Customization
        Column(modifier = Modifier.fillMaxSize()) {
//            Text(
//                text = stringResource(id = R.string.app_name), modifier = Modifier
//                    .background(MaterialTheme.colors.primary)
//                    .padding(16.dp)
//                    .width(200.dp),
//                color = Color.White,
//                fontSize = MaterialTheme.typography.h6.fontSize,
//                fontStyle = FontStyle.Italic,
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//            )

//            Text Customization
//            CustomText3()
        }
    }
}


//    Box
//@Composable
//fun Greeting() {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
//        Box(modifier = Modifier
//            .background(Color.Blue), contentAlignment = Alignment.Center){
//            Box(modifier = Modifier.height(50.dp).width(50.dp).background(Color.Green))
//            Text(text = "I love Android!", fontSize = 40.sp)
//        }
//    }
//}


//Text Customization
//@Composable
//fun CustomText() {
//    Text(
//        text = stringResource(id = R.string.app_name),
//        modifier = Modifier
//            .background(MaterialTheme.colors.primary)
//            .padding(16.dp)
//            .width(200.dp),
//        color = Color.White,
//        fontSize = MaterialTheme.typography.h6.fontSize,
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.Bold,
//        textAlign = TextAlign.Center,
//    )
//}


//Text Customization
//@Composable
//fun CustomText2() {
//    Text(
//        buildAnnotatedString {
//            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)){
//                withStyle(
//                    style = SpanStyle(
//                        color = MaterialTheme.colors.primary,
//                        fontSize = 60.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                ) {
//                    append("A")
//                }
//                append("B")
//                append("C")
//                append("D")
//            }
//        }, modifier = Modifier.width(200.dp)
//    )
//}


//        Text Customization
//@Composable
//fun CustomText3(){
//    Text(text = "Hello World".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
//}


@Composable
fun CustomText() {
    SelectionContainer {
        Column {
            Text(text = "Hello World")
            DisableSelection {
                Text(text = "Hello World")
            }
            Text(text = "Hello World")
        }
    }
}