package com.example.bibliospring.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pagina{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "pagina")
    private List<Livro> pgLivros = new ArrayList<>();

    public Pagina(List<Livro> pgLivros) {
        this.pgLivros = pgLivros;
    }

    public List<Livro> getPgLivros() {
        return pgLivros;
    }

    public void setPgLivros(List<Livro> pgLivros) {
        this.pgLivros = pgLivros;
    }
}
