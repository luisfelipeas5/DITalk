package br.com.luisfelipeas5.ditalk

class BakerInjector {

    companion object {
        private val instance = BakerInjector()

        fun getSingleton(): BakerInjector {
            return instance
        }
    }

    var testMode = false
    val mockDatabase = MockDatabase()

    fun getDatabase(): Database {
        return if (testMode) {
            mockDatabase
        } else {
            RealDatabase()
        }
    }

}
