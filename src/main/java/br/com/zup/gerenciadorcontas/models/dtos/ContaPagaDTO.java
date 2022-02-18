package br.com.zup.gerenciadorcontas.models.dtos;

import br.com.zup.gerenciadorcontas.enums.Status;
import lombok.Data;

@Data
public class ContaPagaDTO {
    private Status status;
}
