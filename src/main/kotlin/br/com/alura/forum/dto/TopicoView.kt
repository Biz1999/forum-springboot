package br.com.alura.forum.dto

import br.com.alura.forum.models.StatusTopico
import java.time.LocalDateTime

data class TopicoView (
    val id: Long? = null,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
)
