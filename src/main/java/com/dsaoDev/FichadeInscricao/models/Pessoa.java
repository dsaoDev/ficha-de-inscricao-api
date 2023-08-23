package com.dsaoDev.FichadeInscricao.models;

import com.dsaoDev.FichadeInscricao.models.enums.Genero;
import com.dsaoDev.FichadeInscricao.models.enums.TipoPessoa;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_pessoa")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private Long nome;

    @Column(length = 20, nullable = false)
    private String sobrenome;

    @Column(length = 20, nullable = false, unique = true)
    private String email;

    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;
}
