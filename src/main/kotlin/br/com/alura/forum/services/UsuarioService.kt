package br.com.alura.forum.services

import br.com.alura.forum.models.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var usuarios : List<Usuario> = ArrayList()) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "ana@email.com.br"
        )

        usuarios = listOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter{ u ->
            u.id == id
        }.findFirst().get()
    }

}