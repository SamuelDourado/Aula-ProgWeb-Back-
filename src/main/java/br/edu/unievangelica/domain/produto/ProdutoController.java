package br.edu.unievangelica.domain.produto;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController extends ResponseAbstractController{
    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return jsonResponse(produtoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return
                new ResponseEntity<>(produtoService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        return jsonResponse(produtoService.delete(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Produto produto){
        return jsonResponse(produtoService.save(produto));
    }
}
