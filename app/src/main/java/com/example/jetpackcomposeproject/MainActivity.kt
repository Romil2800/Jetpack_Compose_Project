package com.example.jetpackcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.jetpackcomposeproject.ui.theme.JetpackComposeProjectTheme
import org.w3c.dom.Text
import java.util.concurrent.TimeUnit

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
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


//                    Text Selection
//                    CustomText()


                    ExpandableCard(
                        title = "My title",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                    )
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

@ExperimentalMaterialApi
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

//            SuperScript/SubScript
//            SuperScriptText(normalText = "Hello", superText = "World!")

            ExpandableCard(
                title = "My title",
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            )
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


// Text Selection
//@Composable
//fun CustomText() {
//    SelectionContainer {
//        Column {
//            Text(text = "Hello World")
//            DisableSelection {
//                Text(text = "Hello World")
//            }
//            Text(text = "Hello World")
//        }
//    }
//}

//SuperScript/SubScript
//@Composable
//fun SuperScriptText(
//    normalText: String,
//    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
//    superText: String,
//    normalTextFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
//) {
//    Text(buildAnnotatedString {
//        withStyle(
//            style = SpanStyle(
//                fontSize = normalFontSize
//            )
//        ) {
//            append(normalText)
//        }
//        withStyle(
//            style = SpanStyle(
//                fontSize = normalTextFontSize,
//                fontWeight = FontWeight.Normal,
//
////                baselineShift = BaselineShift.Subscript
//                baselineShift = BaselineShift.Superscript
//            )
//        ) {
//            append(superText)
//        }
//    })
//}