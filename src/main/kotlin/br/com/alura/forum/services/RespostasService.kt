package br.com.alura.forum.services

import br.com.alura.forum.models.Curso
import br.com.alura.forum.models.Resposta
import br.com.alura.forum.models.Topico
import br.com.alura.forum.models.Usuario
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class RespostasService(private var respostas: List<Resposta>) {

    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programacao"
        )
        val autor = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "ana@email.com"
        )
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = curso,
            autor = autor
        )

        val resposta = Resposta(
            id = 1,
            mensagem = "Resposta 1",
            autor = autor,
            topico = topico,
            solucao = false
        )

        val resposta2 = Resposta(
            id = 2,
            mensagem = "Resposta 2",
            autor = autor,
            topico = topico,
            solucao = false
        )

        respostas = listOf(resposta, resposta2)
    }
    fun listar(idTopico: Long): List<Resposta> {
        return respostas.stream().filter{ r ->
            r.topico.id == idTopico
        }.collect(Collectors.toList())
    }
}
