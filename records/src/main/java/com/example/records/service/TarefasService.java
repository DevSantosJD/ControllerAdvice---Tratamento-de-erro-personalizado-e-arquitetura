package com.example.records.service;

import com.example.records.Mapper.TarefasMapper;
import com.example.records.entity.Tarefas;
import com.example.records.recordsDTO.TarefasRequesteDTOR;
import com.example.records.recordsDTO.TarefasResponseDTOR;
import com.example.records.repository.TarefasRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasMapper tarefasMapper;

    public TarefasService(TarefasRepository tarefasRepository, TarefasMapper tarefasMapper){
        this.tarefasRepository = tarefasRepository;
        this.tarefasMapper = tarefasMapper;
    }

    public void criarTarefa(TarefasRequesteDTOR tarefa){

        if(tarefa == null){
            throw new RuntimeException("Tarefas não podem ser nula");
        }
        Tarefas tarefasEntity = tarefasMapper.toTarefas(tarefa);
        tarefasRepository.save(tarefasEntity);
    }

    public TarefasResponseDTOR selecionarTarefa(Integer tarefaId){
        Tarefas tarefaEntity = tarefasRepository.findById(tarefaId).
                orElseThrow(()-> new RuntimeException("Tarefa não localizada"));
        return tarefasMapper.toTarefasResponse(tarefaEntity);
    }
}
