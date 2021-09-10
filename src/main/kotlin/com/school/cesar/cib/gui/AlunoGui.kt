package com.school.cesar.cib.gui

import com.school.cesar.cib.entity.Aluno
import com.school.cesar.cib.service.AlunoService

class AlunoGui {

    fun constroiNovoAluno(){
        println("Por favor, digite o nome do aluno")
        val nome = readLine()!!

        println("Por favor, digite o cpf do aluno")
        val cpf = readLine()!!

        println("Por favor, digite a primeira senha do aluno")
        val senha = readLine()!!

        val aluno = Aluno(
            nome = nome,
            cpf = cpf,
            senha = senha,
            primeiraSenha = true
        )

        AlunoService.salvar(aluno)
    }
}
