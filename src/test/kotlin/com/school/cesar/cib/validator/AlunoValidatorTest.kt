package com.school.cesar.cib.validator

import com.school.cesar.cib.exception.AlunoInvalidoException
import com.school.cesar.cib.fixtures.aluno
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AlunoValidatorTest {

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
}
