package br.com.bolasdasorte.sorteios.Controllers;


import br.com.bolasdasorte.sorteios.models.SorteioLotofacil;
import br.com.bolasdasorte.sorteios.models.repository.SorteioRepositoryLotofacil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/lotofacil")
public class SorteioLotofacilController {

    @Autowired
    private SorteioRepositoryLotofacil repository;


    @GetMapping("/{id}")
    public @ResponseBody
    Optional<SorteioLotofacil> getByNrSorteio(@PathVariable Integer id)
    {
        if(!repository.findByNrSorteio(id).isPresent()){
            return Optional.ofNullable(null);
        }else{
            return repository.findByNrSorteio(id);
        }
    }




}
