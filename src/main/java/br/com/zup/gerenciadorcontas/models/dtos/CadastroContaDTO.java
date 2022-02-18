package br.com.zup.gerenciadorcontas.models.dtos;

import br.com.zup.gerenciadorcontas.enums.Tipo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CadastroContaDTO {
    private String nome;
    private double valor;
    private Tipo tipo;
    private LocalDate dataDeVencimento;
}
