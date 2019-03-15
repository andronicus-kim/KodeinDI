package io.andronicus.dependencyinjection.data.repository

import io.andronicus.dependencyinjection.data.db.QuoteDao
import io.andronicus.dependencyinjection.data.model.Quote

/**
 * Created by Andronicus on 3/15/2019.
 */
class QuoteRepositoryImpl(val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}