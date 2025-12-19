package com.example.records.recordsDTO;

import lombok.Builder;

@Builder
public record TarefasResponseDTOR(
        Integer idResponse,
        String nomeTarefaResponse,
        String descricaoTarefaResponse){
}
