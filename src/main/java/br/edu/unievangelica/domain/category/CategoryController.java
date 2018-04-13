package br.edu.unievangelica.domain.category;

import br.edu.unievangelica.core.controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        return jsonResponse(categoryService.delete(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody Category category){
        return jsonResponse(categoryService.save(category));
    }

















}
