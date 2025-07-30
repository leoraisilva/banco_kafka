package br.study.users.domain.entity.bank;

import br.study.users.domain.entity.components.Account;

public class Bank {
    private int number;
    private Account account;
    private double mount;
    private double limit;

    public Bank(int number, Account account, double mount, double limit) {
        this.number = number;
        this.account = account;
        this.mount = mount;
        this.limit = limit;
    }

    public int getNumber() {
        return number;
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
