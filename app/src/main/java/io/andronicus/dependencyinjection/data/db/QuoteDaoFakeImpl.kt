package io.andronicus.dependencyinjection.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.andronicus.dependencyinjection.data.model.Quote

/**
 * Created by Andronicus on 3/15/2019.
 */
class QuoteDaoFakeImpl : QuoteDao {

    private val quotesList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quotesList
    }

    override fun addQuote(quote: Quote) {
        quotesList.add(quote)
        quotes.value = quotesList
    }

    override fun getQuotes() = quotes as LiveData<List<Quote>>
}