package com.dsaoDev.FichadeInscricao.dtos;

import com.dsaoDev.FichadeInscricao.models.Endereco;
import com.dsaoDev.FichadeInscricao.models.enums.Genero;
import com.dsaoDev.FichadeInscricao.models.enums.TipoPessoa;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record PessoaResponseDTO(String nome,
                                String sobreNome,
                                String email,
                                String cpf,
                                Endereco endereco,
                                @JsonFormat(pattern = "dd/MM/yyyy")
                                LocalDate dataNascimento,
                                String telefone,
                                Genero genero,
                                TipoPessoa tipoPessoa) {
}
