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
    @Column(name = "limits", nullable = false)
    private double limits;

    public BankModel(int number, Account account, double mount, double limits) {
        this.number = number;
        this.account = account;
        this.mount = mount;
        this.limits = limits;
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
        return limits;
    }

    public void setLimit(double limit) {
        this.limits = limit;
    }
}
