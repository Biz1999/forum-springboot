package br.com.alura.forum.services

import br.com.alura.forum.dto.RespostaForm
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.models.Resposta
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class RespostasService(
    private var respostas: List<Resposta>,
    private val topicoViewMapper: TopicoViewMapper) {

    fun listar(idTopico: Long): List<Resposta> {
        return respostas.stream().filter{ r ->
            r.topico.id == idTopico
        }.collect(Collectors.toList())
    }

    fun cadastrar(form: RespostaForm) {

    }
}
