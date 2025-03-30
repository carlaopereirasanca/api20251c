package br.edu.ifsp.prw3.api20251c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Api20251cApplication {

	public static void main(String[] args) {

		SpringApplication.run(Api20251cApplication.class, args);

	}

}

