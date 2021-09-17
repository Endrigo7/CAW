package com.school.cesar.cib.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SenhaUtilTest {

    @Test
    fun `deve retornar falso quando senha nao contiver letra miniscula`(){
        val retornoObtido = SenhaUtil.isFormatoOK("ABC123")
        assertFalse(retornoObtido)
    }

    @Test
    fun `deve retornar false quando senha nao contiver letra maiscula`(){
        val retornoObtido = SenhaUtil.isFormatoOK("abc123")
        assertFalse(retornoObtido)
    }

    @Test
    fun `deve retornar false quando senha nao contiver numeros`(){
        val retornoObtido = SenhaUtil.isFormatoOK("abcABC")
        assertFalse(retornoObtido)
    }

    @Test
    fun `deve retornar verdadeiro quando senha contiver letras maisculas, maiscula e numeros`(){
        val retornoObtido = SenhaUtil.isFormatoOK("123abcABC")
        assertTrue(retornoObtido)
    }

    @Test
    fun `deve retornar 6c893017696a3d63733e2fa58d8bc964 quando entrada for SeuJair`(){
        val retornoEsperado = "6c893017696a3d63733e2fa58d8bc964"
        val retornoObtido = SenhaUtil.md5("SeuJair")

        assertEquals(retornoEsperado, retornoObtido)
    }

}