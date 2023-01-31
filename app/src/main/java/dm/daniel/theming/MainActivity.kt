package dm.daniel.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dm.daniel.theming.ui.theme.ThemingTheme
import dm.daniel.theming.ui.theme.Typography
import kotlin.text.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    var noInput by remember { mutableStateOf("") }

    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "My Title",
            style = Typography.h5,
            modifier = appModifier
        )
        OutlinedTextField(
            value = noInput,
            onValueChange = { noInput = it },
            modifier = appModifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThemingTheme {
        MyApp()
    }
}