package br.com.zup.gerenciadorcontas.models.dtos;

import br.com.zup.gerenciadorcontas.enums.Tipo;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class RespostaCadastroDTO {
    private int id;
    private String nome;
    private double valor;
    private Tipo tipo;
    private LocalDate dataDeVencimento;
    private LocalDateTime dataDePagamento;
}
