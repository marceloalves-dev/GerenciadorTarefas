package Marcelo.GerenciadorTarefas.controllers;

import Marcelo.GerenciadorTarefas.Repository.TarefaRepository;
import Marcelo.GerenciadorTarefas.tarefas.DtoAtualizarTarefa;
import Marcelo.GerenciadorTarefas.tarefas.DtoBody;
import Marcelo.GerenciadorTarefas.tarefas.DtoDataTarefa;
import Marcelo.GerenciadorTarefas.tarefas.Tarefa;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TarefaController")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;


    @GetMapping
    public List<DtoDataTarefa> exibir() {
        return repository.findAll().stream().map(DtoDataTarefa::new).toList();
    }


    @PostMapping
    @Transactional
    public void adicionar(@RequestBody DtoBody dtoBody) {
        repository.save(new Tarefa(dtoBody));
    }


    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable long id) {
        var aux = repository.getReferenceById(id);
        aux.update();
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable long id) {
        repository.deleteById(id);
    }
}


