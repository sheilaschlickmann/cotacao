package com.sheila.cotacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dolar {

    private String code;

    private double bid;

    //private Date create_date;
}
