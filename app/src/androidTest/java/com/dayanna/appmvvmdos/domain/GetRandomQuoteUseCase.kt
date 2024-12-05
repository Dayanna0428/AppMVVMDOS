package com.dayanna.appmvvmdos.domain

import com.dayanna.appmvvmdos.data.model.QuoteModel
import com.dayanna.appmvvmdos.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}
