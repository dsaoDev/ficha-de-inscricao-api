package com.dsaoDev.FichadeInscricao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FichaDeInscricaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FichaDeInscricaoApplication.class, args);
	}

}
