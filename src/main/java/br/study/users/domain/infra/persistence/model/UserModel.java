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
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "rules", nullable = false)
    private Rules rules;
    @Column(name = "number_bank", nullable = true)
    private int numberBank;
    @Column(name = "document", nullable = false)
    private String document;
    @Column(name = "number_address", nullable = true)
    private int numberAddress;
    @Column(name = "code_address", nullable = true)
    private String codeAddress;

    public UserModel(String username, String password, Rules rules, String document, int numberBank, int numberAddress, String  codeAddress) {
        this.username = username;
        this.password = password;
        this.rules = rules;
        this.document = document;
        this.numberBank = numberBank;
        this.numberAddress = numberAddress;
        this.codeAddress = codeAddress;
    }


    public UserModel() {}

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

    public int getNumberBank() {
        return numberBank;
    }

    public void setNumberBank(int numberBank) {
        this.numberBank = numberBank;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getNumberAddress() {
        return numberAddress;
    }

    public void setNumberAddress(int numberAddress) {
        this.numberAddress = numberAddress;
    }

    public String getCodeAddress() {
        return codeAddress;
    }

    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress;
    }
}
