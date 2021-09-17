package com.school.cesar.cib.validator

import com.school.cesar.cib.entity.Aluno
import com.school.cesar.cib.exception.AlunoInvalidoException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AlunoValidatorTest {

    @Test
    fun `deve lancar excecao quando nome for vazio`() {
        val aluno = Aluno(
            nome = "",
            cpf = "123",
            senha = "123456778",
            primeiraSenha = true
        )

        assertThrows<AlunoInvalidoException> {
            AlunoValidator.validar(aluno)
        }.also {
            assertEquals("O nome deve ser preenchido", it.message)
        }
    }

}