package com.dsaoDev.FichadeInscricao.dtos;

import com.dsaoDev.FichadeInscricao.models.enums.Genero;
import com.dsaoDev.FichadeInscricao.models.enums.TipoPessoa;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PessoaRequestDTO(@NotBlank(message = "nome é obrigatório")
                               @Size(max = 20, min = 5, message = "Nome só pode ter entre {min} e {max} caracters")
                               String nome,
                               @NotBlank(message = "sobrenome é obrigatório")
                               @Size(max = 20, min = 5, message = "sobrenome deve ter entre {min} e {max} caracters")
                               String sobreNome,
                               @Email(message = "Email invalido ou mal formado")
                               @NotBlank(message = "Email é obrigatorio")
                               String email,
                               @CPF(message = "CPF tem que ser valido e seguir o padrão -> (123.456.789-09)")
                               @NotBlank(message = "CPF é obrigatorio")
                               String cpf,
                               @NotBlank(message = "CEP é obrigatorio")
                               @Size(max = 8, message = "CEP tem que ter no maximo {max} characters")
                               String cep,
                               @NotBlank(message = "Data de nascimento é obrigatorio")
                               @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "Data de nascimento tem que estar no padrão dd/MM/yyyy")
                               @JsonFormat(pattern = "dd/MM/yyyy")
                               LocalDate dataNascimento,
                               @NotBlank(message = "telefone é obrigatorio")
                               @Pattern(regexp = "\\(\\d{2}\\) \\d{5}-\\d{4}", message = "telefone em um formato invalido siga o padrão (DDD) 9####-####")
                               String telefone,
                               @Pattern(regexp = "^(MASCULINO|FEMININO|OUTRO)?$", message = "Genero invalido. Use MASCULINO, FEMININO ou OUTRO")
                               Genero genero,
                               @Pattern(regexp = "^(FISICA|JURIDICA)?$", message = "Tipo de pessoa so pode ser FISICA/JURIDICA")
                               TipoPessoa tipoPessoa) {
}

