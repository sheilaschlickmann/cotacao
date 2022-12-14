package com.sheila.cotacao;

import com.sheila.cotacao.cotacaoDto.Cotacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CotacaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CotacaoApplication.class, args);
    }


}
