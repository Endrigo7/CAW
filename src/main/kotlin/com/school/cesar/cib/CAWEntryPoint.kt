package com.school.cesar.cib

import com.school.cesar.cib.gui.AlunoGui

object CAWEntryPoint {

    private val alunoGui = AlunoGui()

    fun inicio(){
        while(true){
            escreveMenu()
            leETrataOpcaoEscolhida()
        }
    }

    private fun leETrataOpcaoEscolhida() {
        readLine()?.toInt()!!
            .apply {
                when (this) {
                    0 -> {
                        print("obrigado por usar o Cesar Academic Web")
                        return
                    }
                    else -> executeOpcao(this)
                }
            }
    }

    private fun escreveMenu(){
        println("Bem vindo ao Cesar Academic Web. Por favor, selecione uma opção")
        println("0 - Encerrar")
        println("1 - Cad Aluno")
        println("2 - Cad Professor")
    }

    private fun executeOpcao(opcaoEscolhida: Int){
        when(opcaoEscolhida){
            1 -> alunoGui.constroiNovoAluno()
        }
    }
}
