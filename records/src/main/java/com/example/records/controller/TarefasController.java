package com.example.records.controller;

import com.example.records.recordsDTO.TarefasRequesteDTOR;
import com.example.records.recordsDTO.TarefasResponseDTOR;
import com.example.records.service.TarefasService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    private final TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService){
        this.tarefasService = tarefasService;
    }


    @PostMapping("/criarTarefas")
    public ResponseEntity<TarefasRequesteDTOR> criarTarefas(@RequestBody @Valid TarefasRequesteDTOR tarefa ){
        tarefasService.criarTarefa(tarefa);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/tareasCriadas/{tarefaId}")
    public ResponseEntity<TarefasResponseDTOR> selecionarTarefa(@PathVariable Integer tarefaId){

        return ResponseEntity.ok(tarefasService.selecionarTarefa(tarefaId));
    }
}
