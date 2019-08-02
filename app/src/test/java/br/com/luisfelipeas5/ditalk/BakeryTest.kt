package br.com.luisfelipeas5.ditalk

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class BakeryTest {

    @Mock
    lateinit var database: Database
    lateinit var bakery: Bakery

    @Before
    fun runBeforeEveryTest() {
        MockitoAnnotations.initMocks(this)
        bakery = Bakery(database)
    }

    @Test
    fun when_loggedIn_expect_breadsIsNotEmpty() {
        Mockito.`when`(database.getToken()).thenReturn("token_mow_nada_a_ver_so_pra_mostrar_pra_galera_um_token")

        val breads = bakery.getBreads()
        assert(breads.isNotEmpty())
    }

    @Test
    fun when_notLoggedIn_expect_breadsIsEmpty() {
        Mockito.`when`(database.getToken()).thenReturn(null)

        val breads = bakery.getBreads()
        assert(breads.isEmpty())
    }

}