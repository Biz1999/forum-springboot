package br.com.alura.forum.models

import br.com.alura.forum.dto.TopicoView
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Resposta (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val autor: Usuario,

    @ManyToOne
    val topico: Topico,
    val solucao: Boolean
)
