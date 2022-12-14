package com.sheila.cotacao.service;

import com.sheila.cotacao.model.CotacaoModel;
import com.sheila.cotacao.repository.CotacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CotacaoService {

    final CotacaoRepository cotacaoRepository;

    public CotacaoService(CotacaoRepository cotacaoRepository) {
        this.cotacaoRepository = cotacaoRepository;
    }

    @Transactional
    public CotacaoModel save(CotacaoModel cotacao) {
        return cotacaoRepository.save(cotacao);
    }
}
