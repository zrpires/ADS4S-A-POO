package com.hc.api.controller;

import com.hc.api.model.PessoaModel;
import com.hc.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> getAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel save(@RequestBody PessoaModel pessoaModel){
        return pessoaService.save(pessoaModel);
    }
}
