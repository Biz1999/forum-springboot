package br.com.alura.forum.exception.repository

import br.com.alura.forum.dto.TopicoPorCategoriaDto
import br.com.alura.forum.models.Topico
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface TopicoRepository: JpaRepository<Topico, Long> {

    fun findByCursoNome(nomeCurso: String, paginacao: Pageable): Page<Topico>

    @Query("SELECT new br.com.alura.forum.dto.TopicoPorCategoriaDto(curso.categoria, count(t)) From Topico t JOIN t.curso curso GROUP BY curso.categoria")
    fun relatorio() : List<TopicoPorCategoriaDto>

    @Query("select t from Topico t where t.respostas is empty")
    fun topicosNaoRespondidos(): List<Topico>
}