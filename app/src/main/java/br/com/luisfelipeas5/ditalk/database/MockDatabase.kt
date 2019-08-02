package br.com.luisfelipeas5.ditalk.database

class MockDatabase: Database {

    var tokenMocked: String? = null

    override fun getToken(): String? {
        return tokenMocked
    }
}