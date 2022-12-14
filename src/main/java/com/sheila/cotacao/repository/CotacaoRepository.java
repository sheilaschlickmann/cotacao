package com.sheila.cotacao.repository;

import com.sheila.cotacao.model.CotacaoId;
import com.sheila.cotacao.model.CotacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotacaoRepository extends JpaRepository<CotacaoModel, CotacaoId> {
}
