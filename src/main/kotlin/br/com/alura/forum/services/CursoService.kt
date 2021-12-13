package br.com.alura.forum.services

import br.com.alura.forum.models.Curso
import br.com.alura.forum.exception.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {


    fun buscarPorId(id: Long): Curso {
        return repository.getById(id)
    }

}
