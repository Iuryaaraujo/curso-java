package br.com.iuryaraujo.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
    @GetMapping
    public String get() {
        return "Requisição GET";
    }

    @PostMapping
    public String post() {
        return "Requisição POST";
    }

    @PatchMapping
    public String patch() {
        return "Requisição PATCH";
    }

    @PutMapping
    public String put() {
        return "Requisição PUT";
    }

    @DeleteMapping
    public String delete() {
        return "Requisição DELETE";
    }
}
