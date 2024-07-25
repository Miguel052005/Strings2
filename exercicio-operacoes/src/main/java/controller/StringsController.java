package com.exemplo.exerciciooperacoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacoes/strings")
public class StringsController {

    
    @GetMapping("/aluno")
    public String visualizarAluno() {
        return "Nome: Seu Nome, Número de Aluno: 123456";
    }

    
    @GetMapping("/cumprimento")
    public String cumprimento(@RequestParam String nome) {
        return "Olá, " + nome + "!";
    }

    
    @GetMapping("/contar-caracteres")
    public int contarCaracteres(@RequestParam String input) {
        return input.length();
    }

   
    @GetMapping("/maiusculas")
    public String converterMaiusculas(@RequestParam String input) {
        return input.toUpperCase();
    }

  
    @GetMapping("/inverter")
    public String inverterString(@RequestParam String input) {
        return new StringBuilder(input).reverse().toString();
    }

   
    @GetMapping("/contar-vogais")
    public long contarVogais(@RequestParam String input) {
        return input.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }


    @GetMapping("/contar-caracteres-strings")
    public int contarCaracteresDuasStrings(@RequestParam String string1, @RequestParam String string2) {
        return string1.length() + string2.length();
    }

   
    @GetMapping("/contar-palavras")
    public long contarPalavras(@RequestParam String input) {
        return input.split("\\s+").length;
    }


    @GetMapping("/contar-letras")
    public long contarLetras(@RequestParam String palavra, @RequestParam char caracter) {
        return palavra.chars()
                .filter(c -> c == caracter)
                .count();
    }
}
