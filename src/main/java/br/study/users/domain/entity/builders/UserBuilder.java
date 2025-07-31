package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Rules;
import br.study.users.domain.entity.users.UsersEntity;

public class UserBuilder implements IUserBuilder{
    private String username;
    private String password;
    private Rules rules;
    private int numberBank;
    private String document;
    private String  codeAddress;
    private int numberAddress;


    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setRules(Rules rules) {
        this.rules = rules;
    }

    @Override
    public void setNumberBank(int numberBank) {
        this.numberBank = numberBank;
    }

    @Override
    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress;
    }

    @Override
    public void setNumberAddress(int numberAddress) {
        this.numberAddress = numberAddress;
    }

    public UsersEntity getResult() {
        return new UsersEntity(this.username, this.password, this.rules, this.document);
    }

    public UsersEntity getAddress() {
        return new UsersEntity(this.username, this.password, this.rules, this.document, this.codeAddress, this.numberAddress);
    }
    public UsersEntity getBank() {
        return new UsersEntity(this.username, this.password, this.rules, this.document, this.numberBank);
    }

}
