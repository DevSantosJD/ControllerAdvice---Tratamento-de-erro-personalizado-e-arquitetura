package com.example.records.Mapper;

import com.example.records.entity.Tarefas;
import com.example.records.recordsDTO.TarefasRequesteDTOR;
import com.example.records.recordsDTO.TarefasResponseDTOR;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-19T08:00:36-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class TarefasMapperImpl implements TarefasMapper {

    @Override
    public Tarefas toTarefas(TarefasRequesteDTOR tarefasDTOR) {
        if ( tarefasDTOR == null ) {
            return null;
        }

        Tarefas.TarefasBuilder tarefas = Tarefas.builder();

        tarefas.id( tarefasDTOR.idRequest() );
        tarefas.nomeTarefa( tarefasDTOR.nomeTarefaRequest() );
        tarefas.descricaoTarefa( tarefasDTOR.descricaoTarefaRequest() );

        return tarefas.build();
    }

    @Override
    public TarefasResponseDTOR toTarefasResponse(Tarefas tarefasEntity) {
        if ( tarefasEntity == null ) {
            return null;
        }

        TarefasResponseDTOR.TarefasResponseDTORBuilder tarefasResponseDTOR = TarefasResponseDTOR.builder();

        tarefasResponseDTOR.idResponse( tarefasEntity.getId() );
        tarefasResponseDTOR.nomeTarefaResponse( tarefasEntity.getNomeTarefa() );
        tarefasResponseDTOR.descricaoTarefaResponse( tarefasEntity.getDescricaoTarefa() );

        return tarefasResponseDTOR.build();
    }
}
