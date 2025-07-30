package br.study.users.domain.infra.persistence.model;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Rules;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "rules", nullable = false)
    private Rules rules;
    @Column(name = "bank", nullable = true)
    private Bank bank;
    @Column(name = "document", nullable = false)
    private String document;
    @Column(name = "address", nullable = true)
    private Address address;

    public UserModel(String username, String password, Rules rules, Bank bank, String document, Address address) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.bank = bank;
        this.document = document;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
