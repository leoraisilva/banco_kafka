package br.study.users.infra.gateway;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.infra.persistence.mapper.BankMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BankModelRepository implements IBankRepository {
    private final IBankModelRepository repository;
    private final BankMapper bankMapper;

    public BankModelRepository(IBankModelRepository repository, BankMapper bankMapper) {
        this.repository = repository;
        this.bankMapper = bankMapper;
    }

    @Override
    public Bank createBank(Bank bank) {
        return bankMapper.toDomain(repository.save(bankMapper.toEntity(bank)));
    }

    @Override
    public List<Bank> listBank() {
        return repository.findAll()
                .stream()
                .map(bankMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Bank getBank(int numberBank) {
        return bankMapper.toDomain(repository.findByNumberBank(numberBank));
    }

    @Override
    public Bank editBank(int numberBank, Bank bank) {
        var model = repository.findByNumberBank(numberBank);
        model.setAccount(bank.getAccount());
        model.setMount(bank.getMount());
        model.setLimit(bank.getLimit());
        model.setNumberBank(bank.getNumberBank());
        return bankMapper.toDomain(repository.save(model));
    }

    @Override
    public void deleteBank(int numberBank) {
        repository.delete(repository.findByNumberBank(numberBank));
    }
}
