package br.com.luisfelipeas5.ditalk

class Bakery {

    private val database = Database()
    private val api = Api()

    fun getBreads(): List<Bread> {
        val token = database.getToken()
        return api.getBreads(token)
    }

}