package com.example.records.Mapper;

import com.example.records.entity.Tarefas;
import com.example.records.recordsDTO.TarefasRequesteDTOR;
import com.example.records.recordsDTO.TarefasResponseDTOR;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-19T08:47:16-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Oracle Corporation)"
)
@Component
public class TarefasMapperImpl implements TarefasMapper {

    @Override
    public Tarefas toTarefas(TarefasRequesteDTOR tarefasDTOR) {
        if ( tarefasDTOR == null ) {
            return null;
        }

        Tarefas tarefas = new Tarefas();

        tarefas.setId( tarefasDTOR.idRequest() );
        tarefas.setNomeTarefa( tarefasDTOR.nomeTarefaRequest() );
        tarefas.setDescricaoTarefa( tarefasDTOR.descricaoTarefaRequest() );

        return tarefas;
    }

    @Override
    public TarefasResponseDTOR toTarefasResponse(Tarefas tarefasEntity) {
        if ( tarefasEntity == null ) {
            return null;
        }

        Integer idResponse = null;
        String nomeTarefaResponse = null;
        String descricaoTarefaResponse = null;

        idResponse = tarefasEntity.getId();
        nomeTarefaResponse = tarefasEntity.getNomeTarefa();
        descricaoTarefaResponse = tarefasEntity.getDescricaoTarefa();

        TarefasResponseDTOR tarefasResponseDTOR = new TarefasResponseDTOR( idResponse, nomeTarefaResponse, descricaoTarefaResponse );

        return tarefasResponseDTOR;
    }
}
