package br.com.alura.forum.repository

import br.com.alura.forum.models.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository: JpaRepository<Topico, Long> {

}