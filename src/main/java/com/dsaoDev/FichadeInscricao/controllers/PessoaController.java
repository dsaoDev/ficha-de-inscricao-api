package com.dsaoDev.FichadeInscricao.controllers;

import com.dsaoDev.FichadeInscricao.dtos.PessoaRequestDTO;
import com.dsaoDev.FichadeInscricao.dtos.PessoaResponseDTO;
import com.dsaoDev.FichadeInscricao.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;


    @PostMapping(value = "/salvar")
    public ResponseEntity<PessoaResponseDTO> salvar (@RequestBody PessoaRequestDTO pessoaRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaRequest));
    }


}
