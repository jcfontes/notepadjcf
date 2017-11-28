package br.com.jcfontes.notepad.controller;

import br.com.jcfontes.notepad.model.Nota;
import br.com.jcfontes.notepad.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    NotaService service;

    @GetMapping
    List<Nota> findAll() {
        return service.findAll();
    }

    @GetMapping("/titulos/{titulo}")
    Nota findByTitulo(@PathVariable("titulo") String titulo) {
        return service.findByTitulo(titulo);
    }

    @PostMapping
    void salvar(@RequestBody Nota nota) {
        service.save(nota);
    }
}
