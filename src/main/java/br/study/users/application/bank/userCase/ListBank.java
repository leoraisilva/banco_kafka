package br.study.users.application.bank.userCase;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.domain.entity.bank.Bank;

import java.util.List;

public class ListBank {

    private final IBankRepository repository;

    public ListBank(IBankRepository repository) {
        this.repository = repository;
    }

    public List<Bank> listBank() {
        return repository.listBank();
    }
}
