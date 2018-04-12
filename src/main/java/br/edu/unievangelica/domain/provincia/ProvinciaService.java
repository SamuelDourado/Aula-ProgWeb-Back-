package br.edu.unievangelica.domain.provincia;

import br.edu.unievangelica.core.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService extends AbstractService<Provincia>{

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public List<Provincia> listarPorPais(long paisId) {
        return provinciaRepository.listarPorPais(paisId);
    }
}
