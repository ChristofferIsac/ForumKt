package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService {
    fun Listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Duvida",
            mensagem = "Variáveis",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Isabelle",
                email = "Belizotti@gmail.com"
            )
        )
        return Arrays.asList(topico, topico, topico)
    }
}