package br.com.zup.gerenciadorcontas.models;

import br.com.zup.gerenciadorcontas.enums.Status;
import br.com.zup.gerenciadorcontas.enums.Tipo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Conta {
    private String nome;
    private double valor;
    private Tipo tipoConta;
    private Status statusConta;
    private LocalDate dataDeVencimento;
    private LocalDateTime dataDePagamento;
}