package br.com.alura.forum.services

import br.com.alura.forum.models.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(var cursos : List<Curso> = ArrayList()) {

    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "programação"
        )

        cursos = listOf(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter{ c ->
            c.id == id
        }.findFirst().get()
    }

}
