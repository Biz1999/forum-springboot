package br.com.alura.forum.controllers

import br.com.alura.forum.models.Topico
import br.com.alura.forum.services.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico> = service.listar()

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico = service.buscarPorId(id)

    @PostMapping
    fun cadastrar(@RequestBody topico: Topico){
        service.cadastrar(topico)
    }
}