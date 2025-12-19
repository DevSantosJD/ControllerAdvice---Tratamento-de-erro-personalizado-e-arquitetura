package com.example.records.Mapper;

import com.example.records.entity.Tarefas;
import com.example.records.recordsDTO.TarefasRequesteDTOR;
import com.example.records.recordsDTO.TarefasResponseDTOR;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TarefasMapper {

    // Request DTO → Entity
    @Mapping(source = "idRequest", target = "id")
    @Mapping(source = "nomeTarefaRequest", target = "nomeTarefa")
    @Mapping(source = "descricaoTarefaRequest", target = "descricaoTarefa")
    Tarefas toTarefas(TarefasRequesteDTOR tarefasDTOR);

    // Entity → Response DTO
    @Mapping(source = "id", target = "idResponse")
    @Mapping(source = "nomeTarefa", target = "nomeTarefaResponse")
    @Mapping(source = "descricaoTarefa", target = "descricaoTarefaResponse")
    TarefasResponseDTOR toTarefasResponse(Tarefas tarefasEntity);
}