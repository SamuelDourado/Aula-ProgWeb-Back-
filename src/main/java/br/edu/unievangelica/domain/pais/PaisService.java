package br.edu.unievangelica.domain.pais;

import br.edu.unievangelica.core.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService extends AbstractService<Pais> {

    @Autowired
    public PaisRepository paisRepository;

    public List<Pais> listarPorOrdemAlfabetica(){
        return paisRepository.findAllByOrderByNomeAsc();
    }
}
