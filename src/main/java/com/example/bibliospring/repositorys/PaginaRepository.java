package com.example.bibliospring.repositorys;

import com.example.bibliospring.models.Pagina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaginaRepository extends JpaRepository<Pagina, Integer> {
}
