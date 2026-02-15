package com.example.bibliospring.repositorys;

import com.example.bibliospring.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

    void deleteAllById(Integer id);
    @Query("SELECT nome FROM Categoria")
    Optional<Categoria> findByNome(String nome);
}
