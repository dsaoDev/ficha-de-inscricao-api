package com.dsaoDev.FichadeInscricao.services;

import com.dsaoDev.FichadeInscricao.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

}
