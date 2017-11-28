package br.com.jcfontes.notepad

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class NotepadApplication

fun main(args: Array<String>) {
    SpringApplication.run(NotepadApplication::class.java, *args)
}
