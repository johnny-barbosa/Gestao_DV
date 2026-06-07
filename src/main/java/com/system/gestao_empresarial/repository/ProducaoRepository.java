package com.system.gestao_empresarial.repository;

import com.system.gestao_empresarial.entity.Producao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducaoRepository extends JpaRepository<Producao, Long> {
}
