package com.sheila.cotacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cotacao {

    @JsonProperty("USDBRL")
    private Dolar usdbrl;

    @JsonProperty("EURBRL")
    private Euro eurbrl;
}
