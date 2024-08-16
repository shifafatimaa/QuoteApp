package com.example.quoteapp

import android.content.Context
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import com.example.quoteapp.models.Quote
import com.google.gson.Gson

object DataManager {
    var data =emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)
    var currQuote:Quote?=null
    var page= mutableStateOf(pages.listing)
    fun loadAssetsFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer=ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer,Charsets.UTF_8)
        val gson= Gson()
        data=gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value=true



    }
    fun PageSwitcher(quote: Quote){
        if(page.value==pages.listing){
            currQuote=quote
            page.value=pages.detail
        }
        else{
            page.value=pages.listing
        }
    }
}