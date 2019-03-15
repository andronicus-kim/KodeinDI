package io.andronicus.dependencyinjection.data.repository

import androidx.lifecycle.LiveData
import io.andronicus.dependencyinjection.data.model.Quote

/**
 * Created by Andronicus on 3/15/2019.
 */
interface QuoteRepository {

    fun addQuote(quote: Quote)

    fun getQuotes() : LiveData<List<Quote>>
}