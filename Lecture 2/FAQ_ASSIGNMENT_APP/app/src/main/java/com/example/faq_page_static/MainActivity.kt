package com.example.faq_page_static

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faq_page_static.ui.theme.FAQ_PAGE_STATICTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FAQ_PAGE_STATICTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Greeting(
                        modifier = Modifier.padding()
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.padding(all=8.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.faq_2), contentDescription = "FAQ Image")
        Text(
            text = "1. What happens if I enter the wrong OTP during account verification?",
            modifier = modifier,
            color = Color(red = 0.357f, green = 0.29f, blue = 0.725f, alpha = 1.0f),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
       Text(
            text = "If you entered the wrong OTP, you will be shown an error message and will have to " +
                    "re-enter the correct code. Please mention the correct OTP that you receive on your" +
                    "registered mobile number via SMS to proceed with the verification process successfully.",
       )
        Text(
            text = "2. Where can I contact if I face any issues while booking a hotel using app? ",
            modifier = modifier,
            color = Color(red = 0.357f, green = 0.29f, blue = 0.725f, alpha = 1.0f),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "If you face any issues during your booking process you can reach out to our customer " +
                    "support team by at dummy@book_nest.com or call us at 9999999999.",
        )
        Text(
            text = "3. Is my personal information secure when using this app? ",
            modifier = modifier,
            color = Color(red = 0.357f, green = 0.29f, blue = 0.725f, alpha = 1.0f),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Yes, we value the trust of our users and prioritise the security of their personal" +
                    "information. All your data including personal details and booking information is " +
                    "secure with and protected using encryption protocols to ensure security.",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FAQ_PAGE_STATICTheme {
        Greeting()
    }
}