package com.example.myapplication.utilities

import com.example.myapplication.data.FakeDatabase
import com.example.myapplication.data.QuoteRepository
import com.example.myapplication.ui.QuotesViewModelFactory

object InjectorUtils {

    // This will be called from QuotesActivity
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}