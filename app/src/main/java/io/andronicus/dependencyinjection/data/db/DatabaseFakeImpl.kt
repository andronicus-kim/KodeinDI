package io.andronicus.dependencyinjection.data.db

/**
 * Created by Andronicus on 3/15/2019.
 */
class DatabaseFakeImpl : Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}