package br.study.users.domain.entity.bank;

import br.study.users.domain.entity.components.Account;

public class Bank {
    private int numberBank;
    private Account account;
    private double mount;
    private double limit;

    public Bank(int numberBank, Account account, double mount, double limit) {
        this.numberBank = numberBank;
        this.account = account;
        this.mount = mount;
        this.limit = limit;
    }

    public int getNumberBank() {
        return numberBank;
    }

    public Account getAccount() {
        return account;
    }

    public double getMount() {
        return this.mount;
    }

    public double getLimit() {
        return limit;
    }
}
