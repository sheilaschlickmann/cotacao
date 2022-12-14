package com.sheila.cotacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cotacao")
@Entity
public class CotacaoModel {

    @EmbeddedId
    private CotacaoId cotacaoId;

    @Column
    private double valor;

}
