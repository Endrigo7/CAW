package com.school.cesar.cib.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SenhaUtilTest {

    @Test
    fun `deve retornar 6c893017696a3d63733e2fa58d8bc964 quando entrada for SeuJair`(){
        val retornoEsperado = "6c893017696a3d63733e2fa58d8bc964"
        val retornoObtido = SenhaUtil.md5("SeuJair")

        assertEquals(retornoEsperado, retornoObtido)
    }

}