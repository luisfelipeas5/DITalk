package br.com.luisfelipeas5.ditalk

class MockDatabase: Database {

    var tokenMocked: String? = null

    override fun getToken(): String? {
        return tokenMocked
    }
}