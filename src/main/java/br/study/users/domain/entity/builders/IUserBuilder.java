package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.components.Rules;
import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;

public interface IUserBuilder {
    void setUsername(String username) ;
    void setPassword(String password) ;
    void setRules(Rules rules) ;
    void setBank(Bank bank) ;
    void setDocument(String document) ;
    void setAddress(Address address) ;
}
