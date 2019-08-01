package br.com.luisfelipeas5.ditalk

class Database {

    fun isLoggedIn(): Boolean {
        return true
    }

    fun getBreads(): List<Bread> {
        return listOf(
            Bread(Bread.FRENCH_ID),
            Bread(Bread.PANETONE_ID),
            Bread(Bread.HOT_DOG_ID)
        )
    }


}
