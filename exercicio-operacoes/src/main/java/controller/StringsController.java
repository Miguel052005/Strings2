package com.exemplo.exerciciooperacoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacoes/strings")
public class StringsController {

    // Passo 5: Endpoint que retorna o nome e número de aluno
    @GetMapping("/aluno")
    public String visualizarAluno() {
        return "Nome: Seu Nome, Número de Aluno: 123456";
    }

    // Passo 6: Endpoint que recebe um nome e retorna um cumprimento personalizado
    @GetMapping("/cumprimento")
    public String cumprimento(@RequestParam String nome) {
        return "Olá, " + nome + "!";
    }

    // Passo 7.1: Endpoint que conta o número de caracteres de uma string
    @GetMapping("/contar-caracteres")
    public int contarCaracteres(@RequestParam String input) {
        return input.length();
    }

    // Passo 7.2: Endpoint que converte uma string para maiúsculas
    @GetMapping("/maiusculas")
    public String converterMaiusculas(@RequestParam String input) {
        return input.toUpperCase();
    }

    // Passo 7.3: Endpoint que inverte uma string
    @GetMapping("/inverter")
    public String inverterString(@RequestParam String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Passo 7.4: Endpoint que conta o número de vogais em uma string
    @GetMapping("/contar-vogais")
    public long contarVogais(@RequestParam String input) {
        return input.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count();
    }

    // Passo 7.5: Endpoint que conta o número total de caracteres de duas strings
    @GetMapping("/contar-caracteres-strings")
    public int contarCaracteresDuasStrings(@RequestParam String string1, @RequestParam String string2) {
        return string1.length() + string2.length();
    }

    // Passo 7.6: Endpoint que conta o número de palavras em uma string
    @GetMapping("/contar-palavras")
    public long contarPalavras(@RequestParam String input) {
        return input.split("\\s+").length;
    }

    // Passo 7.7: Endpoint que conta o número de ocorrências de um caractere em uma string
    @GetMapping("/contar-letras")
    public long contarLetras(@RequestParam String palavra, @RequestParam char caracter) {
        return palavra.chars()
                .filter(c -> c == caracter)
                .count();
    }
}
