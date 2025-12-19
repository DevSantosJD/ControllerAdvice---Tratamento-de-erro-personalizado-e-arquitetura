package com.example.records.recordsDTO;

import lombok.Builder;
import jakarta.validation.constraints.NotBlank;

@Builder
public record TarefasRequesteDTOR(

        Integer idRequest,

        @NotBlank(message = "Nome da tarefa é obrigatório")
        String nomeTarefaRequest,

        @NotBlank(message = "Descrição da tarefa é obrigatória")
        String descricaoTarefaRequest
) {}
