package io.andronicus.dependencyinjection.ui.quotes

import androidx.lifecycle.ViewModel
import io.andronicus.dependencyinjection.data.model.Quote
import io.andronicus.dependencyinjection.data.repository.QuoteRepository

/**
 * Created by Andronicus on 3/15/2019.
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun addQuote(quote: Quote){
        quoteRepository.addQuote(quote)
    }

    fun getQuotes() = quoteRepository.getQuotes()
}