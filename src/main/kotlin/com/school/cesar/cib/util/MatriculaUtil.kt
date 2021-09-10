package com.school.cesar.cib.util

import java.time.LocalDate

object MatriculaUtil {

    fun geraMatricula() =
        "${LocalDate.now().year.toString().padStart(4, '0')}" +
        "${LocalDate.now().month.toString().padStart(2, '0')}" +
        "${LocalDate.now().dayOfMonth.toString().padStart(2, '0')}"
}
