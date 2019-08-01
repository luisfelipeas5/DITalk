package br.com.luisfelipeas5.ditalk

import org.junit.Test

class BakeryTest {

    private val bakeryDatabase = Bakery()

    @Test
    fun when_loggedIn_expect_breadsIsNotEmpty() {
        val breads = bakeryDatabase.getBreads()
        assert(breads.isNotEmpty())
    }

    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        val breads = bakeryDatabase.getBreads()
        assert(breads.isEmpty())
    }

}