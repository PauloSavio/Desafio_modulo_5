package br.com.zup.gerenciadorcontas.models;

import br.com.zup.gerenciadorcontas.enums.Status;
import br.com.zup.gerenciadorcontas.enums.Tipo;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "contas")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private double valor;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "data_de_vencimento")
    private LocalDate dataDeVencimento;
    @Column(name = "data_de_pagamento")
    private LocalDateTime dataDePagamento;
}