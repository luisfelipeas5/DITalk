package br.com.luisfelipeas5.ditalk

class MockDatabase: Database {

    private val bakerGodInstance = BakerGod.getSingleton()

    override fun getToken(): String? {
        return bakerGodInstance.tokenMocked
    }
}