package com.school.cesar.cib.util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CPFUtilTest {

    @Test
    fun `deve retornar cpf sem mascara quando receber cpf com mascara`(){
        val retornoEsperado = "12312312312"
        val retornoObitdo = CPFUtil.limpaCPF("123.123.123-12")

        assertEquals(retornoEsperado, retornoObitdo)
    }
}
