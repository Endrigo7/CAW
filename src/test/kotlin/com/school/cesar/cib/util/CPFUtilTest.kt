package com.school.cesar.cib.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CPFUtilTest {

    @Test
    fun `deve retornar cpf sem mascara quando receber cpf com mascara`(){
        val retornoEsperado = "12312312312"
        val retornoObitdo = CPFUtil.limpaCPF("123.123.123-12")

        assertEquals(retornoEsperado, retornoObitdo)
    }

    @Test
    fun `deve retornar cpf sem mascara quando receber cpf sem mascara`(){
        val retornoEsperado = "12312312312"
        val retornoObitdo = CPFUtil.limpaCPF("12312312312")

        assertEquals(retornoEsperado, retornoObitdo)
    }

    @Test
    fun `deve retornar falso quando cpf for vazio`(){
        val retornoObitido = CPFUtil.isCPF("")
        assertFalse(retornoObitido)
    }

    @Test
    fun `deve retornar falso quando o numero de caracteres do cpf for diferente de 11`(){
        val retornoObitido = CPFUtil.isCPF("123")
        assertFalse(retornoObitido)
    }

    @Test
    fun `deve retornar falso quando cpf todos os digitos forem iguais`(){
        val retornoObitido = CPFUtil.isCPF("11111111111")
        assertFalse(retornoObitido)
    }

    @Test
    fun `deve retornar falso quando cpf estiver com digito verificador invalido`(){
        val retornoObitido = CPFUtil.isCPF("961.806.390-99")
        assertFalse(retornoObitido)
    }

    @Test
    fun `deve retornar verdadeiro quando cpf for valido`(){
        val retornoObitido = CPFUtil.isCPF("961.806.390-94")
        assertTrue(retornoObitido)
    }

    @Test
    fun `deve retornar 9 quando o primeiro digito do cpf for 9`(){
        val retornoEsperado = 9
        val retornoObitido = CPFUtil.calculaDigito1( listOf(9, 6, 1, 8, 0, 6, 3, 9, 0, 9, 4))
        assertEquals(retornoEsperado, retornoObitido)
    }

    @Test
    fun `deve retornar 4 quando o segundo digito do cpf for 4`(){
        val retornoEsperado = 4
        val retornoObitido = CPFUtil.calculaDigito2(listOf(9, 6, 1, 8, 0, 6, 3, 9, 0, 9, 4), 9)
        assertEquals(retornoEsperado, retornoObitido)
    }
}
