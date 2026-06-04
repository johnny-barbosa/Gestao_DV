package com.system.gestao_empresarial.repository;
import com.system.gestao_empresarial.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}