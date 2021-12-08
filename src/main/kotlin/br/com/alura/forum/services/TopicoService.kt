package br.com.alura.forum.services

import br.com.alura.forum.models.Curso
import br.com.alura.forum.models.Topico
import br.com.alura.forum.models.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService(private var topicos: List<Topico> = ArrayList()) {

    fun listar(): List<Topico> = topicos

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

    fun cadastrar(topico: Topico) {
        topicos.plus(topico)
    }
}