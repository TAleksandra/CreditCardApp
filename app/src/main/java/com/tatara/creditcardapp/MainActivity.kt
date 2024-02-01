package com.tatara.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tatara.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards() {
    val cards = listOf(
        CardInfo(
            "1111 2222 3333 4444",
            "Jack Reacher",
            R.drawable.mastercard1,
            R.drawable.bg1
        ),
        CardInfo(
            "5555 6666 7777 8888",
            "John Smith",
            R.drawable.visa,
            R.drawable.bg3
        ),
        CardInfo(
            "9999 0000 4567 2356",
            "Jason Statham",
            R.drawable.mastercard1,
            R.drawable.bg2
        ),
        CardInfo(
            "9485 3095 4563 2346",
            "Alexander Fox",
            R.drawable.visa,
            R.drawable.bg4
        )
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(cards) {card ->
            CreditCard(cardInfo = card)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreditCardAppTheme {
    }
}