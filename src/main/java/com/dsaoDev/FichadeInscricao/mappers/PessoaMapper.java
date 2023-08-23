package com.dsaoDev.FichadeInscricao.mappers;

import com.dsaoDev.FichadeInscricao.dtos.PessoaRequestDTO;
import com.dsaoDev.FichadeInscricao.dtos.PessoaResponseDTO;
import com.dsaoDev.FichadeInscricao.models.Pessoa;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public Pessoa deDTORequestParaEntidade (PessoaRequestDTO pessoaRequest){
        return new Pessoa(pessoaRequest);
    }

    public PessoaResponseDTO deEntidadeParaResponseDTO (Pessoa pessoa){
    return new PessoaResponseDTO(pessoa.getNome(),
        pessoa.getSobreNome(),
        pessoa.getEmail(),
        pessoa.getCpf(),
        pessoa.getEndereco(),
        pessoa.getDataNascimento(),
        pessoa.getTelefone(),
        pessoa.getGenero(),
        pessoa.getTipoPessoa());
    }

}
