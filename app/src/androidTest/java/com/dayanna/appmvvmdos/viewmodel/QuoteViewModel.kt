package com.dayanna.appmvvmdos.viewmodel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dayanna.appmvvmdos.model.QuoteModel
import com.dayanna.appmvvmdos.model.QuoteProvider

class QuoteViewModel:ViewModel (){
    val  quoteModel = MutableLiveData<QuoteModel>()



    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }




}
