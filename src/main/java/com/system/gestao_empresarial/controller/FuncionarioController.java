package com.system.gestao_empresarial.controller;

import com.system.gestao_empresarial.entity.Funcionario;
import com.system.gestao_empresarial.repository.FuncionarioRepository;
import com.system.gestao_empresarial.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }


    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return service.salvar(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public Funcionario editar(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        funcionario.setId(id);
        return service.editar(id, funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
