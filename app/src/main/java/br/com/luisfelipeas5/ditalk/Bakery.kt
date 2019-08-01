package br.com.luisfelipeas5.ditalk

class Bakery {

    private val database = Database()

    fun getBreads(): List<Bread> {
        val loggedIn = database.isLoggedIn()
        return if (loggedIn) {
            database.getBreads()
        } else {
            emptyList()
        }
    }

}