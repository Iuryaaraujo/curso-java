package br.com.iuryaraujo.exerciciosspringboot.controllers;

import br.com.iuryaraujo.exerciciosspringboot.model.entities.Produto;
import br.com.iuryaraujo.exerciciosspringboot.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoControlller {

//    @PostMapping
//    public Produto novoProduto(@RequestParam String nome,
//                               @RequestParam double preco,
//                               @RequestParam double desconto) {
//        Produto produto = new Produto(nome, preco, desconto);
//        produtoRepository.save(produto);
//        return produto;


    @Autowired //Esta anotação está
// injetando automaticamente uma instancia produtoRepositori
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}


