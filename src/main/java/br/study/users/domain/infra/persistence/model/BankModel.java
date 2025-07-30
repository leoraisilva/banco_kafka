package br.study.users.domain.infra.persistence.model;

import br.study.users.domain.entity.components.Account;
import jakarta.persistence.*;

@Entity
@Table(name = "bank")
public class BankModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bankId;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "account", nullable = false)
    private Account account;
    @Column(name = "mount", nullable = false)
    private double mount;
    @Column(name = "limit", nullable = false)
    private double limit;

    public BankModel(int number, Account account, double mount, double limit) {
        this.number = number;
        this.account = account;
        this.mount = mount;
        this.limit = limit;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
