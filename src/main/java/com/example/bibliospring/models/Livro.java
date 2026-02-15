package com.example.bibliospring.models;

import com.example.bibliospring.enums.Edicao;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private String sinopse;
    private Edicao opcao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnore
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "pagina_id")
    @JsonIgnore
    private Pagina pagina;

    public Livro(){

    }

    public Livro(Integer id, String titulo, String autor, String sinopse, Edicao opcao, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.opcao = opcao;
        this.categoria = categoria;
    }

    public Edicao getOpcao() {
        return opcao;
    }

    public void setOpcao(Edicao opcao) {
        this.opcao = opcao;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Pagina getPagina() {return pagina;}

    public void setPagina(Pagina pagina) {this.pagina = pagina;}
}
