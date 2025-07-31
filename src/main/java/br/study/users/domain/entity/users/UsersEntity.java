package br.study.users.domain.entity.users;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Rules;

public class UsersEntity {
    private String username;
    private String password;
    private Rules rules;
    private int numberBank;
    private String document;
    private String  codeAddress;
    private int numberAddress;

    public UsersEntity(String username, String password, Rules rules, String document) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
    }

    public UsersEntity(String username, String password, Rules rules, String document, String codeAddress, int numberAddress) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.codeAddress = codeAddress;
        this.numberAddress = numberAddress;
    }

    public UsersEntity(String username, String password, Rules rules, String document, int numberBank) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.numberBank = numberBank;
    }

    public UsersEntity(String username, String password, Rules rules, String document, String codeAddress, int numberAddress, int numberBank) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.codeAddress = codeAddress;
        this.numberAddress = numberAddress;
        this.numberBank = numberBank;
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

    public String getDocument() {
        return document;
    }

    public int getNumberBank() {
        return numberBank;
    }

    public String getCodeAddress() {
        return codeAddress;
    }

    public int getNumberAddress() {
        return numberAddress;
    }
}
