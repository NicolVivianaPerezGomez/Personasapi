package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface TipoPersonaRepository extends Repository<TipoPersona, Integer> {

    List<TipoPersona> findAll();
    
    TipoPersona findById(int id);
    
    TipoPersona save(TipoPersona p);

    void delete(TipoPersona p);
}
