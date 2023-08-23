package com.dsaoDev.FichadeInscricao.services;

import com.dsaoDev.FichadeInscricao.dtos.PessoaRequestDTO;
import com.dsaoDev.FichadeInscricao.dtos.PessoaResponseDTO;
import com.dsaoDev.FichadeInscricao.integration.ViaCepClient;
import com.dsaoDev.FichadeInscricao.mappers.PessoaMapper;
import com.dsaoDev.FichadeInscricao.models.Endereco;
import com.dsaoDev.FichadeInscricao.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private ViaCepClient viaCepClient;
    @Autowired
    private PessoaMapper pessoaMapper;

    public PessoaResponseDTO salvar (PessoaRequestDTO pessoaRequest){
        var pessoa = pessoaMapper.deDTORequestParaEntidade(pessoaRequest);
        var endereco = viaCepClient.getCepInfo(pessoaRequest.cep());
        pessoa.setEndereco(endereco);
        return pessoaMapper.deEntidadeParaResponseDTO(repository.save(pessoa));
    }


}
