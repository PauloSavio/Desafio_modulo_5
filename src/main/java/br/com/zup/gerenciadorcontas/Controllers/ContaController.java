package br.com.zup.gerenciadorcontas.Controllers;

import br.com.zup.gerenciadorcontas.Services.ContaService;
import br.com.zup.gerenciadorcontas.models.Conta;
import br.com.zup.gerenciadorcontas.models.dtos.CadastroContaDTO;
import br.com.zup.gerenciadorcontas.models.dtos.RespostaCadastroDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaCadastroDTO cadastrarConta(@RequestBody CadastroContaDTO cadastroContaDTO) {
        RespostaCadastroDTO respostaCadastroDTO = modelMapper.map(cadastroContaDTO, RespostaCadastroDTO.class);
        Conta conta = modelMapper.map(cadastroContaDTO, Conta.class);
        contaService.cadastrarConta(conta);

        return respostaCadastroDTO;
    }

}