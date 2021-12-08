package br.com.alura.forum.controllers

import br.com.alura.forum.models.Resposta
import br.com.alura.forum.services.RespostasService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/respostas")
class RespostasController(private val respostasService: RespostasService) {

    @GetMapping("/{id}")
    fun listaRespostas(@PathVariable id: Long): List<Resposta> =
        respostasService.listar(id)
}