package br.study.users.application.bank.userCase;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.domain.entity.bank.Bank;

public class EditBank {
    private final IBankRepository repository;

    public EditBank(IBankRepository repository) {
        this.repository = repository;
    }

    public Bank editBank(int numberBank, Bank bank) {
        return repository.editBank(numberBank, bank);
    }

}
