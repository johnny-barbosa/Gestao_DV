package com.system.gestao_empresarial.service;


import com.system.gestao_empresarial.entity.Producao;
import com.system.gestao_empresarial.repository.ProducaoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProducaoService {

    private final ProducaoRepository repository;

    public ProducaoService(ProducaoRepository repository) {
        this.repository = repository;
    }

    public Producao salvar(Producao producao) {
        if(producao.getValor().compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("Valor inválido");
        }
        return repository.save(producao);
    }

    public List<Producao> listar() {
        return repository.findAll();
    }

    public Producao editar(Long id, Producao producao) {

        producao.setId(id);

        return repository.save(producao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }


}
