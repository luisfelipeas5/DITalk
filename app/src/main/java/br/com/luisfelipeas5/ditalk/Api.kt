package br.com.luisfelipeas5.ditalk

class Api {

    fun getBreads(token: String?): List<Bread> {
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
