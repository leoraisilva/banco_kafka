package br.study.users.application.bank.userCase;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.domain.entity.bank.Bank;

public class GetBank {
    private final IBankRepository repository;

    public GetBank(IBankRepository repository) {
        this.repository = repository;
    }

    public Bank getBank(int numberBank) {
        return repository.getBank(numberBank);
    }

}
