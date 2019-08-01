package br.com.luisfelipeas5.ditalk

class BakerGod {

    companion object {
        private val instance = BakerGod()

        fun getSingleton(): BakerGod {
            return instance
        }
    }

    var testMode = false
    var tokenMocked: String? = null

}
