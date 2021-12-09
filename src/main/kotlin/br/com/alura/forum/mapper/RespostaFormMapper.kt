package br.com.alura.forum.mapper

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.RespostaForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.models.Resposta
import br.com.alura.forum.models.Topico
import br.com.alura.forum.services.CursoService
import br.com.alura.forum.services.TopicoService
import br.com.alura.forum.services.UsuarioService
import org.springframework.stereotype.Component

@Component
class RespostaFormMapper(
    private val topicoService: TopicoService,
    private val usuarioService: UsuarioService
): Mapper<RespostaForm, Resposta> {

    override fun map(t: RespostaForm): Resposta {
        return Resposta(
            mensagem = t.mensagem,
            autor = usuarioService.buscarPorId(t.idAutor),
            topico = topicoService.buscarPorId(t.idTopico),
            solucao = true
        )
    }

}