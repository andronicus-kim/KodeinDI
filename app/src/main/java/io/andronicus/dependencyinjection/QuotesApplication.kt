package io.andronicus.dependencyinjection

import android.app.Application
import io.andronicus.dependencyinjection.data.db.Database
import io.andronicus.dependencyinjection.data.db.DatabaseFakeImpl
import io.andronicus.dependencyinjection.data.db.QuoteDao
import io.andronicus.dependencyinjection.data.repository.QuoteRepository
import io.andronicus.dependencyinjection.data.repository.QuoteRepositoryImpl
import io.andronicus.dependencyinjection.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/**
 * Created by Andronicus on 3/15/2019.
 */
class QuotesApplication : Application(),KodeinAware {

    override val kodein: Kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}