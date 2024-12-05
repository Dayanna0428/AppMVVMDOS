package com.dayanna.appmvvmdos.data.repositories


import com.dayanna.appmvvmdos.data.model.QuoteModel
import com.dayanna.appmvvmdos.data.model.QuoteProvider
import com.dayanna.appmvvmdos.data.notwork.QuoteService

class QuoteRepository {
    private val quoteService = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel> {
        val response = quoteService.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}