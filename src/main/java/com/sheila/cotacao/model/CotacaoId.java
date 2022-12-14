package com.sheila.cotacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
public class CotacaoId implements Serializable {

    @Column
    private String moeda;
    @Column
    private String data_cotacao;

    public CotacaoId(String usd, String s) {
    }

    public CotacaoId() {

    }
}
