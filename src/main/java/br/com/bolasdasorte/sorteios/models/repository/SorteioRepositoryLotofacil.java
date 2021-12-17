package br.com.bolasdasorte.sorteios.models.repository;

import br.com.bolasdasorte.sorteios.models.SorteioLotofacil;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SorteioRepositoryLotofacil extends CrudRepository<SorteioLotofacil, Integer> {



    @Query(value = "SELECT * from sorteios_lotofacil where nr_sorteio = :nr", nativeQuery = true)
    Optional<SorteioLotofacil> findByNrSorteio(@Param("nr")Integer nr_sorteio);
}
