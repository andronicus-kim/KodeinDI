package io.andronicus.dependencyinjection.data.db

import androidx.lifecycle.LiveData
import io.andronicus.dependencyinjection.data.model.Quote

/**
 * Created by Andronicus on 3/15/2019.
 */
interface QuoteDao {

    fun addQuote(quote: Quote)

    fun getQuotes() : LiveData<List<Quote>>
}