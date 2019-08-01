package br.com.luisfelipeas5.ditalk

class Bakery {

    private val database = Database()

    fun getBreads(): List<Bread> {
        val token = database.getToken()

        return if (token.isNullOrBlank()) {
            emptyList()
        } else {
            listOf(
                Bread(Bread.FRENCH_ID),
                Bread(Bread.PANETONE_ID),
                Bread(Bread.HOT_DOG_ID)
            )
        }
    }

}