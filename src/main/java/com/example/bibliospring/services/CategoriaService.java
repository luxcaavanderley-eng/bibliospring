package com.example.bibliospring.services;

import com.example.bibliospring.models.Categoria;
import com.example.bibliospring.repositorys.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.get();
    }
    public List<Categoria> findAll() {
        List<Categoria> list = categoriaRepository.findAll();
        return list;
    }

    public Categoria save(Categoria categoria) {
        Categoria cat = categoriaRepository.save(categoria);
        return cat;
    }

    public Categoria update(Categoria categoria) {
        Categoria cat = categoriaRepository.save(categoria);
        return cat;
    }
    public void delete(Integer id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        categoriaRepository.delete(categoria.get());
    }




}
