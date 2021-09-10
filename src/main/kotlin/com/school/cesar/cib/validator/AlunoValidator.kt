package com.school.cesar.cib.validator

import com.school.cesar.cib.entity.Aluno
import com.school.cesar.cib.exception.AlunoInvalidoException
import com.school.cesar.cib.util.CPFUtil
import com.school.cesar.cib.util.CPFUtil.isCPF
import com.school.cesar.cib.util.SenhaUtil

object AlunoValidator {

    fun validar(aluno: Aluno){
        validaCamposObrigatorios(aluno)
        validaTamanhoCampos(aluno)
        validaformato(aluno)
    }

    private fun validaCamposObrigatorios(aluno: Aluno){
        if(aluno.nome.isBlank()){
            throw AlunoInvalidoException("O nome deve ser preenchido")
        }

        if(aluno.cpf.isBlank()){
            throw AlunoInvalidoException("O cpf deve ser preenchido")
        }

        if(aluno.senha.isBlank()){
            throw AlunoInvalidoException("A senha deve ser preenchida")
        }
    }

    private fun validaTamanhoCampos(aluno: Aluno){
        if(aluno.nome.length > 150){
            throw AlunoInvalidoException("O campo nome deve ter menos de 150 caracteres")
        }

        if(aluno.cpf.length != 11){
            throw AlunoInvalidoException("O campo cpf deve ter 11 caracteres numericos")
        }

        if(aluno.senha.length !in 8..15){
            throw AlunoInvalidoException("O campo senha deve ter entre 8 e 15 caracteres")
        }
    }

    private fun validaformato(aluno: Aluno){
        if(!isCPF(aluno.cpf)){
            throw AlunoInvalidoException("O cpf é invalido")
        }

        if(!SenhaUtil.isFormatoOK(aluno.senha)){
            throw AlunoInvalidoException("O a senha deve conter numeros, letras maisculas e minusculas")
        }
    }
}
