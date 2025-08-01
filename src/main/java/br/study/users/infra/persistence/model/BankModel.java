package br.study.users.infra.persistence.model;

import br.study.users.domain.entity.components.Account;
import jakarta.persistence.*;

@Entity
@Table(name = "bank")
public class BankModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bankId;
    @Column(name = "number_bank", nullable = false)
    private int numberBank;
    @Column(name = "account", nullable = false)
    private Account account;
    @Column(name = "mount", nullable = false)
    private double mount;
    @Column(name = "limits", nullable = false)
    private double limits;

    public BankModel(int numberBank, Account account, double mount, double limits) {
        this.numberBank = numberBank;
        this.account = account;
        this.mount = mount;
        this.limits = limits;
    }
    public BankModel() {}

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public int getNumberBank() {
        return numberBank;
    }

    public void setNumberBank(int numberBank) {
        this.numberBank = numberBank;
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
