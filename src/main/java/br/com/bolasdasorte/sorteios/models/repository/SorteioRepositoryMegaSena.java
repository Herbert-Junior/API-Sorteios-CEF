package br.com.bolasdasorte.sorteios.models.repository;

import br.com.bolasdasorte.sorteios.models.SorteioMegaSena;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SorteioRepositoryMegaSena extends CrudRepository<SorteioMegaSena, Integer> {
    @Query(value = "SELECT * from sorteios_megasena where nr_sorteio = :nr", nativeQuery = true)
    Optional<SorteioMegaSena> findByNrSorteio(@Param("nr")Integer nr_sorteio);
}
