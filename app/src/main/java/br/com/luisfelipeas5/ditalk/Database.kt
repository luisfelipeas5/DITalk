package br.com.luisfelipeas5.ditalk

class Database {

    private val bakerGodInstance = BakerGod.getSingleton()

    fun getToken(): String? {
        return if (bakerGodInstance.testMode) {
            bakerGodInstance.tokenMocked
        } else {
            return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbnRlcnByaXNlIjoiTWFkZWluQmFrZXIiLCJuYW1lIjoiTHVpcyBCYW" +
                    "tlciBTaWx2YSIsInBhc3N3b3JkIjoibmFvX2V4aXN0ZV9pbmZvcm1hY2FvX3NlbnNpdmVsX2FxdWkifQ.ZFUBji6Ll5KO-A9_" +
                    "3jMec95djkELPFhHEOXu4Q2KNX8"
        }
    }

}
