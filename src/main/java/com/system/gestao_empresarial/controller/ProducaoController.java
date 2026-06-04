package com.system.gestao_empresarial.controller;

import com.system.gestao_empresarial.entity.Producao;
import com.system.gestao_empresarial.service.ProducaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producoes")
public class ProducaoController {

    private final ProducaoService service;

    public ProducaoController(ProducaoService service) {
        this.service = service;
    }

    @PostMapping
    public Producao salvar(@RequestBody Producao producao) {
        return service.salvar(producao);
    }

    @GetMapping
    public List<Producao> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public Producao editar(@PathVariable Long id,
                           @RequestBody Producao producao) {

        return service.editar(id, producao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}