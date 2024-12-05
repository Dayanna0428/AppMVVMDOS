package com.dayanna.appmvvmdos.domain


import com.dayanna.appmvvmdos.data.model.QuoteModel
import com.dayanna.appmvvmdos.data.repositories.QuoteRepository

class GetQuotesUseCase {
    private val quoteRepository = QuoteRepository()
    //    suspend operator fun invoke(): List<QuoteModel>? {
//        return quoteRepository.getAllQuotes()
//    }
    suspend operator fun invoke(): List<QuoteModel>? = quoteRepository.getAllQuotes()
}