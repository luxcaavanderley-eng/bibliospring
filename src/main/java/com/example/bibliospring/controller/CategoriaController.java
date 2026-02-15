package com.example.bibliospring.controller;

import com.example.bibliospring.dtos.CategoriaDTO;
import com.example.bibliospring.models.Categoria;
import com.example.bibliospring.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> findById(@PathVariable Integer id){
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(categoria, CategoriaDTO.class));
    }
    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> listAll(){
        List<Categoria> list = categoriaService.findAll();
        List<CategoriaDTO> listDto = new ArrayList<>();
        for (Categoria categoria : list){
            listDto.add(modelMapper.map(categoria, CategoriaDTO.class));
        }
        return ResponseEntity.ok().body(listDto);
    }
    @PostMapping
    public ResponseEntity<CategoriaDTO> save(@RequestBody CategoriaDTO categoriaDto){
        Categoria categoria1 = modelMapper.map(categoriaDto, Categoria.class);
        Categoria cat = categoriaService.save(categoria1);
        return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDTO.class));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaDTO> update(@PathVariable Integer id, @RequestBody CategoriaDTO categoriaDto) {
        Categoria categoria = modelMapper.map(categoriaDto, Categoria.class);
        categoria.setId(id);
        Categoria cat = categoriaService.update(categoria);
        return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDTO.class));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
