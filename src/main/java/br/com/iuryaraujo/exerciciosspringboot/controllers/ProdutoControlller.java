package br.com.iuryaraujo.exerciciosspringboot.controllers;

import br.com.iuryaraujo.exerciciosspringboot.model.entities.Produto;
import br.com.iuryaraujo.exerciciosspringboot.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

//    @PostMapping
//    public Produto novoProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @GetMapping
    public Iterable<Produto> obterTodosProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }
//    @PutMapping
//    public Produto alterarProduro(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }
    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}


