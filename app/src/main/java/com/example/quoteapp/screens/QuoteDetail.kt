package com.example.quoteapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote
import kotlin.text.Typography.quote


@Composable
fun QuoteDetail(quote: Quote){
    Box(
        //Alignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )


    ){
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.Center)
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                modifier= Modifier
                    //.align(Alignment.Center)
                    .padding(16.dp,16.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quote",
                    modifier= Modifier
                        .size(70.dp)
                        .rotate(180F)

                )

            }
            Text(text = quote.text,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(start = 12.dp, bottom = 4.dp, end = 12.dp)
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Text(
                text =quote.author,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.padding(start=12.dp,top=4.dp, bottom = 16.dp, end = 12.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun QuoteDetailPreview() {
//    QuoteDetail()
//}