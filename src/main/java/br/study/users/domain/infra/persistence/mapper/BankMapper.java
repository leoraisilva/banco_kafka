package br.study.users.domain.infra.persistence.mapper;

import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.infra.persistence.model.BankModel;

public class BankMapper {
    public Bank toDomain(BankModel bankModel) {
        return new Bank(bankModel.getNumber(), bankModel.getAccount(), bankModel.getMount(), bankModel.getLimit());
    }

    public BankModel toEntity(Bank bank) {
        return new BankModel(bank.getNumber(), bank.getAccount(), bank.getMount(), bank.getLimit());
    }
}
