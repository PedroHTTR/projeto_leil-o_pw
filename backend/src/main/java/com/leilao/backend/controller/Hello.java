package com.leilao.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leilao.backend.model.Calculadora;

@RestController
public class Hello {

    @GetMapping("/")
    public String hello() {
        return "Olá, Spring";
    }

    @GetMapping("/somar")
    public Integer somar(@RequestParam("v1") Integer valor1, @RequestParam("v2") Integer valor2) {
        return valor1 + valor2;
    }

    @PostMapping("/somar")
    public Calculadora somar(@RequestBody Calculadora calculadora) {
        calculadora.setResultado(calculadora.getV1() + calculadora.getV2());
        return calculadora;
    }
}