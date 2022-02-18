package br.com.zup.gerenciadorcontas.Repositories;

import br.com.zup.gerenciadorcontas.models.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
}