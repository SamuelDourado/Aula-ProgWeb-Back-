package br.edu.unievangelica.domain.category;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(long id){
        return categoryRepository.findOne(id);
    }

    public boolean delete(long id){
        categoryRepository.delete(id);
        return true;
    }

    public Category save(Category category){
        return categoryRepository.save(category);

    }
}
