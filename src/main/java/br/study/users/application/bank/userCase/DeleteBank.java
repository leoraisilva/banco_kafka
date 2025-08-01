package br.study.users.application.bank.userCase;

import br.study.users.application.bank.gateway.IBankRepository;

public class DeleteBank {

    private final IBankRepository repository;
    public DeleteBank(IBankRepository repository) {
        this.repository = repository;
    }

    public void deleteBank(int numberBank) {
        repository.deleteBank(numberBank);
    }

}
