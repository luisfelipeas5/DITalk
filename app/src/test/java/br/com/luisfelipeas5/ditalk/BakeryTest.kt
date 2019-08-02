package br.com.luisfelipeas5.ditalk

import org.junit.Before
import org.junit.Test

class BakeryTest {

    private val bakerInjector = BakerInjector.getSingleton()
    private val bakery = Bakery()

    @Before
    fun beforeEveryTestRuns() {
        bakerInjector.testMode = true
    }

    @Test
    fun when_loggedIn_expect_breadsIsNotEmpty() {
        //bakerInjector.tokenMocked = "token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token"
        bakerInjector.mockDatabase.tokenMocked = "token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token"

        val breads = bakery.getBreads()
        assert(breads.isNotEmpty())
    }

    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        //bakerInjector.tokenMocked = null
        bakerInjector.mockDatabase.tokenMocked = null

        val breads = bakery.getBreads()
        assert(breads.isEmpty())
    }

}