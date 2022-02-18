package br.com.zup.gerenciadorcontas.models;

import br.com.zup.gerenciadorcontas.enums.Status;
import br.com.zup.gerenciadorcontas.enums.Tipo;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Conta {
    private String nome;
    private double valor;
    private Tipo tipo;
    private Status status;
    private LocalDate dataDeVencimento;
    private LocalDateTime dataDePagamento;
}