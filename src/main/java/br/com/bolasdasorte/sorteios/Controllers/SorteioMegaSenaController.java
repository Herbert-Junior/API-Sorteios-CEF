package br.com.bolasdasorte.sorteios.Controllers;

import br.com.bolasdasorte.sorteios.models.SorteioMegaSena;
import br.com.bolasdasorte.sorteios.models.repository.SorteioRepositoryMegaSena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/megasena")
public class SorteioMegaSenaController {
    @Autowired
    private SorteioRepositoryMegaSena repository;



    @GetMapping("/{id}")
    public @ResponseBody
    Optional<br.com.bolasdasorte.sorteios.models.SorteioMegaSena> getByNrSorteio(@PathVariable Integer id)
    {
        if(!repository.findByNrSorteio(id).isPresent()){
            return Optional.ofNullable(null);
        }else{
            return repository.findByNrSorteio(id);
        }
    }
}
