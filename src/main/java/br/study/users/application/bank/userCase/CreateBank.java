package br.study.users.application.bank.userCase;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.domain.entity.bank.Bank;

public class CreateBank {
    private final IBankRepository repository;

    public CreateBank(IBankRepository repository) {
        this.repository = repository;
    }

    public Bank createBank(Bank bank) {
        return repository.createBank(bank);
    }

}
