package br.com.alura.forum.dto

import br.com.alura.forum.models.Topico
import br.com.alura.forum.models.Usuario
import java.time.LocalDateTime
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class RespostaForm (

    @field:NotEmpty
    @field:Size(min = 5, max=100)
    val mensagem: String,

    @field:NotNull
    val idAutor: Long,

    @field:NotNull
    val idTopico: Long,
)