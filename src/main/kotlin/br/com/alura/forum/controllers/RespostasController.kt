package br.com.alura.forum.controllers

import br.com.alura.forum.dto.RespostaForm
import br.com.alura.forum.models.Resposta
import br.com.alura.forum.services.RespostasService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/respostas")
class RespostasController(private val respostasService: RespostasService) {

    @GetMapping("/{id}")
    fun listaRespostas(@PathVariable id: Long): List<Resposta> =
        respostasService.listar(id)

    @PostMapping
    fun cadastraResposta(@RequestBody @Valid resposta: RespostaForm){
        respostasService.cadastrar(resposta)
    }
}