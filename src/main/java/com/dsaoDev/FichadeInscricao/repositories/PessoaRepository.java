package com.dsaoDev.FichadeInscricao.repositories;

import com.dsaoDev.FichadeInscricao.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long > {


}
