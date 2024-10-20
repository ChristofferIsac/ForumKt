package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import kotlin.collections.ArrayList

@Service
class TopicoService(private var topicos: List<Topico> = ArrayList()) {


    fun Listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }

    fun cadastrar(@RequestBody topico: Topico): Void {
        topicos.plus(topico)

    }
}