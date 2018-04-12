package br.edu.unievangelica.domain.category;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryController extends ResponseAbstractController{
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        return jsonResponse(categoryService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return
                new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

}
