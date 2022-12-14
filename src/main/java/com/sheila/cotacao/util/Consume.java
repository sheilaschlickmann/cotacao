package com.sheila.cotacao.util;

import com.sheila.cotacao.dto.Cotacao;
import com.sheila.cotacao.dto.Dolar;
import com.sheila.cotacao.model.CotacaoId;
import com.sheila.cotacao.model.CotacaoModel;
import com.sheila.cotacao.service.CotacaoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Consume {

    final CotacaoService cotacaoService;

    public Consume(CotacaoService cotacaoService) {
        this.cotacaoService = cotacaoService;
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Cotacao result = restTemplate.getForObject(
                    "https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL", Cotacao.class);

            Dolar dolar = new Dolar();

            dolar.setBid(result.getUsdbrl().getBid());

            dolar.setCode(result.getEurbrl().getCode());

            //dolar.setCreate_date(result.getUsdbrl().getCreate_date());



            Cotacao cotacao = new Cotacao();

            cotacao.setUsdbrl(dolar);

         /*   CotacaoModel cotacaoSalva = cotacaoService.save(new CotacaoModel(new CotacaoId("USD", "2022-10-10"),
                    10.12));
*/

            System.out.println("code " + result.getUsdbrl().getCode());

            System.out.println("valor " + result.getUsdbrl().getBid());

            System.out.println("code e" + result.getEurbrl().getCode());

            System.out.println("valor e" + result.getEurbrl().getBid());



        };

    }
}
