package com.school.cesar.cib.entity

data class Aluno(
    var matricula: String? = null,
    val nome: String,
    var cpf: String,
    var senha: String,
    var primeiraSenha: Boolean
)
