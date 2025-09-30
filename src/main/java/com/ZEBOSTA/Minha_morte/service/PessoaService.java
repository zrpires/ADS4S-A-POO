package com.hc.api.service;

import com.hc.api.model.PessoaModel;
import com.hc.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();
    }

    public PessoaModel save(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }
}
