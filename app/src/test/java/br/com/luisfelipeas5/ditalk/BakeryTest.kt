package br.com.luisfelipeas5.ditalk

import org.junit.Test

class BakeryTest {

    private var database = MockDatabase()
    private val bakery = Bakery(database)

    @Test
    fun when_loggedIn_expect_breadsIsNotEmpty() {
        database.tokenMocked = "token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token"

        val breads = bakery.getBreads()
        assert(breads.isNotEmpty())
    }

    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        database.tokenMocked = null

        val breads = bakery.getBreads()
        assert(breads.isEmpty())
    }

}