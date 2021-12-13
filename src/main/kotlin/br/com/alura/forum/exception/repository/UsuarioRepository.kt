package br.com.alura.forum.exception.repository

import br.com.alura.forum.models.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long> {

    fun findByEmail(username: String?) : Usuario?
}