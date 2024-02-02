package br.com.iuryaraujo.exerciciosspringboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
        return a + b;
    }
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b){
        return a - b;
    }
    @GetMapping("/multiplicacao/{a}/{b}")
    public int multiplicacao(@PathVariable int a, @PathVariable int b){
        return a * b;
    }
    @GetMapping("/dividir")
    public double dividir(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        if(b == 0){
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return (double) a / b;
    }
}
