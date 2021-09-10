package com.school.cesar.cib.util

import java.math.BigInteger
import java.security.MessageDigest

object SenhaUtil {

    fun isFormatoOK(senha: String) : Boolean {
        var contemLetraMinuscula: Boolean = false
        var contemLetraMaiscula: Boolean = false
        var contemNumero: Boolean = false

        for (letra in senha){
            if(letra in 'a'..'z'){
                contemLetraMinuscula = true
            }

            if(letra in 'A'..'Z'){
                contemLetraMaiscula = true
            }

            if(letra in '0'..'9'){
                contemNumero = true
            }
        }
        return contemLetraMinuscula && contemLetraMaiscula && contemNumero
    }

    fun md5(input:String): String {
        val md = MessageDigest.getInstance("MD5")

        return BigInteger(1, md.digest(input.toByteArray()))
            .toString(16)
            .padStart(32, '0')
    }
}
