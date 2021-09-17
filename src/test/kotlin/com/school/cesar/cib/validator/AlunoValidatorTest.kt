package com.school.cesar.cib.validator

import com.school.cesar.cib.exception.AlunoInvalidoException
import com.school.cesar.cib.fixtures.aluno
import com.school.cesar.cib.util.CPFUtil
import io.mockk.every
import io.mockk.mockkObject
import io.mockk.unmockkAll
import io.mockk.verify
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AlunoValidatorTest {

    @BeforeEach
    fun beforeEach() {
        mockkObject(CPFUtil)
    }

    @AfterEach
    fun afterEach() {
        unmockkAll()
    }

    @Test
    fun `deve lancar excecao quando nome for vazio`() {
        assertThrows<AlunoInvalidoException> {
            AlunoValidator.validar(aluno.copy(nome = ""))
        }.also {
            assertEquals("O nome deve ser preenchido", it.message)
        }
    }

    @Test
    fun `deve lancar excecao quando cpf for vazio`() {
        assertThrows<AlunoInvalidoException> {
            AlunoValidator.validar(aluno.copy(cpf = ""))
        }.also {
            assertEquals("O cpf deve ser preenchido", it.message)
        }
    }

    @Test
    fun `deve lancar exececao quando CPF nao for valido`() {
        every { CPFUtil.isCPF("12312312312") } returns false

        assertThrows<AlunoInvalidoException> {
            AlunoValidator.validar(aluno)
        }.also {
            assertEquals("O cpf é invalido", it.message)
        }

        verify {
            CPFUtil.isCPF("12312312312")
        }
    }
}
