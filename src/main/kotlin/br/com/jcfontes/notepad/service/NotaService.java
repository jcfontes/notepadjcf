package br.com.jcfontes.notepad.service;

import br.com.jcfontes.notepad.model.Nota;
import br.com.jcfontes.notepad.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService {

    @Autowired
    NotaRepository repository;

    public void save(Nota nota) {
        Nota aux = repository.findByTitulo(nota.getTitulo());
        if (aux != null) {
            nota.setId(aux.getId());
        }
        repository.save(nota);
    }

    public List<Nota> findAll() {
        return repository.findAll();
    }

    public Nota findByTitulo(String titulo) {
        return repository.findByTitulo(titulo);
    }
}