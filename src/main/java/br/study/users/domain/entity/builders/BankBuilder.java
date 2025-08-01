package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Account;

public class BankBuilder implements IBankBuilder{
    private int numberBank;
    private Account account;
    private double mount;
    private double limit;

    @Override
    public void setNumberBank(int numberBank) {
        this.numberBank = numberBank;
    }

    @Override
    public void setAccount(Account account) {
        this.account = account;
    }
    @Override
    public void setMount(double mount) {
        this.mount = mount;
    }

    @Override
    public void setLimit(double limit) {
        this.limit = limit;
    }

    public Bank getResult() {
        return new Bank(this.numberBank, this.account, this.mount, this.limit);
    }
}
