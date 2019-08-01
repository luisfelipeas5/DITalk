package br.com.luisfelipeas5.ditalk

import org.junit.Before
import org.junit.Test

class BakeryTest {

    private val bakeryDatabase = Bakery()
    private val bakerGodInstance = BakerGod.getSingleton()

    @Before
    fun beforeEveryTestRuns() {
        bakerGodInstance.testMode = true
    }

    @Test
    fun when_loggedIn_expect_breadsIsNotEmpty() {
        bakerGodInstance.tokenMocked = "token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token"

        val breads = bakeryDatabase.getBreads()
        assert(breads.isNotEmpty())
    }

    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        bakerGodInstance.tokenMocked = null

        val breads = bakeryDatabase.getBreads()
        assert(breads.isEmpty())
    }

}