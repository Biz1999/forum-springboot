package br.com.alura.forum.models

import br.com.alura.forum.dto.TopicoView
import java.time.LocalDateTime

data class Resposta (
    var id: Long? = null,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: TopicoView,
    val solucao: Boolean
)
