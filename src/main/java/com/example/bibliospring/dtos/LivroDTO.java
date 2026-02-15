package com.example.bibliospring.dtos;

import com.example.bibliospring.enums.Edicao;
import com.example.bibliospring.models.Categoria;

public class LivroDTO {
    private Integer id;
    private String titulo;
    private String autor;
    private String sinopse;
    private Edicao opcao;
    private Categoria categoria;

    public LivroDTO(Integer id, String titulo, String autor, String sinopse, Edicao opcao, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.opcao = opcao;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Edicao getOpcao() {
        return opcao;
    }

    public void setOpcao(Edicao opcao) {
        this.opcao = opcao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
