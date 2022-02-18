package br.com.zup.gerenciadorcontas.Services;

import br.com.zup.gerenciadorcontas.Repositories.ContaRepository;
import br.com.zup.gerenciadorcontas.models.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public void cadastrarConta(Conta conta) {
        contaRepository.save(conta);
    }


}
