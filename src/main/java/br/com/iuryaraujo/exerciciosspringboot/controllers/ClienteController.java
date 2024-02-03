package br.com.iuryaraujo.exerciciosspringboot.controllers;

import br.com.iuryaraujo.exerciciosspringboot.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes") //Url
public class ClienteController {
    @GetMapping(path = "/pesquisado")
    public Cliente obterCliente() {
        return new Cliente(28, "Iury", "123.456.789-00");
    }
    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }
    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "David Souza","11.222.333-44");
    }
}
