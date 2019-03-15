package io.andronicus.dependencyinjection.data.model

/**
 * Created by Andronicus on 3/15/2019.
 */
data class Quote(val quoteText: String,
                 val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}