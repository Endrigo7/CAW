package com.school.cesar.cib.service

import com.school.cesar.cib.entity.Aluno
import com.school.cesar.cib.util.CPFUtil
import com.school.cesar.cib.util.CPFUtil.limpaCPF
import com.school.cesar.cib.util.MatriculaUtil.geraMatricula
import com.school.cesar.cib.util.SenhaUtil
import com.school.cesar.cib.validator.AlunoValidator
import com.school.cesar.cib.validator.AlunoValidator.validar

object AlunoService {

    fun salvar(aluno: Aluno){
        aluno.cpf = limpaCPF(aluno.cpf)
        validar(aluno)
        complementaAluno(aluno)

        println(aluno)
        //salvar aluno do bd
    }

    private fun complementaAluno(aluno: Aluno){
        aluno.senha = SenhaUtil.md5(aluno.senha)
        aluno.primeiraSenha = true
        aluno.matricula = geraMatricula()
    }
}
