package br.study.users.application.bank.gateway;

import br.study.users.domain.entity.bank.Bank;

import java.util.List;

public interface IBankRepository {
    Bank createBank (Bank bank);
    List<Bank> listBank();
    Bank getBank(int number);
    Bank editBank(int number, Bank bank);
    void deleteBank (int number);
}
