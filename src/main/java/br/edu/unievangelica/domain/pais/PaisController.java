package br.edu.unievangelica.domain.pais;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pais")
public class PaisController extends ResponseAbstractController {

    @Autowired
    PaisService paisService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(paisService.listarPorOrdemAlfabetica());
    }

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<?> findById(@PathVariable long id) {
//        return jsonResponse(paisService.findOne(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<?> save(@Validated @RequestBody Pais pais) {
//        return jsonResponse(paisService.save(pais));
//    }
//
//    @PutMapping
//    public ResponseEntity<?> update(@Validated @RequestBody Pais pais) {
//        return jsonResponse(paisService.save(pais));
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<?> delete(@PathVariable long id) {
//        paisService.delete(id);
//        return jsonResponse(null);
//    }

}
