package com.system.gestao_empresarial.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "producao")
@Getter
@Setter
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;

    private String banco;

    private String proposta;

    private String indicacao;

    private String nome;

    private BigDecimal valor;

    private LocalDate enviado;

    private String andamento;

    private String pstAvs;

    private String linha;

    private LocalDate formalizadoEm;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
}
