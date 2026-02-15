package com.example.bibliospring.services;

import com.example.bibliospring.enums.Edicao;
import com.example.bibliospring.models.Categoria;
import com.example.bibliospring.models.Livro;
import com.example.bibliospring.repositorys.CategoriaRepository;
import com.example.bibliospring.repositorys.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.example.bibliospring.enums.Edicao.SEGUNDA;

@Service
public class DBservice {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaDB(){
        Categoria cat1 = new Categoria(null,"Infórmatica", "Livros de infórmatica");
        Categoria cat2 = new Categoria(null,"Ficção científica", "Livros de ficção científica");
        Categoria cat3 = new Categoria(null,"Biografia", "Livros de biografias");

        Livro l1 = new Livro(null,"Clean code", "Robertin Martin", "Lorem ipsum", Edicao.SEGUNDA, cat1);
        Livro l2 = new Livro(null,"Engenharia do software", "Louis V. Gerstner", "Lorem ipsum", Edicao.TERCEIRA, cat1);
        Livro l3 = new Livro(null,"The war of the worlds", "H. G. Wells", "Lorem ipsum", Edicao.PRIMEIRA , cat2);
        Livro l4 = new Livro(null,"The time machine", "H. G. Wells", "Lorem ipsum", Edicao.SEGUNDA, cat2);
        Livro l5 = new Livro(null,"I, robot", "Isaac Asimov", "Lorem ipsum", Edicao.TERCEIRA, cat2);
        Livro l6 = new Livro(null,"Duna", "Frank Herbert", "Lorem ipsum", Edicao.SEGUNDA, cat2);

        cat1.getLivros().addAll(Arrays.asList(l1,l2));
        cat2.getLivros().addAll(Arrays.asList(l3,l4,l5, l6));

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5, l6));
    }
}
