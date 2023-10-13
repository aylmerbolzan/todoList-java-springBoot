package com.aylmerbolzan.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota

public class MinhaPrimeiraController {

    /*  
        *  Métodos HTTP:
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Deletar um dado/informação
     * PATCH - Alterar uma parte específica da informação
     * 
     */

     // Método (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou!";
    }
}
