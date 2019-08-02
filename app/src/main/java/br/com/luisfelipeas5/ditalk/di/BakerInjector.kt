package br.com.luisfelipeas5.ditalk.di

import br.com.luisfelipeas5.ditalk.bakery.Bakery
import br.com.luisfelipeas5.ditalk.database.Database
import br.com.luisfelipeas5.ditalk.database.RealDatabase

class BakerInjector {

    companion object {
        private val instance = BakerInjector()

        fun getInstance(): BakerInjector {
            return instance
        }
    }

    var database: Database = RealDatabase()

    fun getBakery(): Bakery {
        return Bakery(database)
    }

}
