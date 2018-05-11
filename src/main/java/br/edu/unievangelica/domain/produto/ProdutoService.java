package br.edu.unievangelica.domain.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(long id){
        return produtoRepository.findOne(id);
    }

    public boolean delete(long id){
        produtoRepository.delete(id);
        return true;
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);

    }


}
