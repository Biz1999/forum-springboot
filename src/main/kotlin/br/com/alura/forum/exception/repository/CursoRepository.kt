package br.com.alura.forum.exception.repository

import br.com.alura.forum.models.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository : JpaRepository<Curso, Long> {
}