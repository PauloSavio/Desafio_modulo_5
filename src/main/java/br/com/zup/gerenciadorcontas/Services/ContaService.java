package br.com.zup.gerenciadorcontas.Services;

import br.com.zup.gerenciadorcontas.Repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;


}