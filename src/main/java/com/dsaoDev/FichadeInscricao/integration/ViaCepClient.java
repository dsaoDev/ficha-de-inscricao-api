package com.dsaoDev.FichadeInscricao.integration;

import com.dsaoDev.FichadeInscricao.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCepClient", url = "https://viacep.com.br/")
public interface ViaCepClient {

    @GetMapping("ws/{cep}/json/")
    Endereco getCepInfo (@PathVariable("cep") String cep);

}
