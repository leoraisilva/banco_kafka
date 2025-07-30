package br.study.users.domain.entity.users;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Rules;

public class UsersEntity {
    private String username;
    private String password;
    private Rules rules;
    private Bank bank;
    private String document;
    private Address address;

    public UsersEntity(String username, String password, Rules rules, String document) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
    }

    public UsersEntity(String username, String password, Rules rules, String document, Address address) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.address = address;
    }

    public UsersEntity(String username, String password, Rules rules, String document, Bank bank) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.bank = bank;
    }

    public UsersEntity(String username, String password, Rules rules, String document, Address address, Bank bank) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.address = address;
        this.bank = bank;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Rules getRules() {
        return rules;
    }

    public Bank getBank() {
        return bank;
    }

    public String getDocument() {
        return document;
    }

    public Address getAddress() {
        return address;
    }
}
