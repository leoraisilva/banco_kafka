package br.study.users.domain.infra.persistence.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String addressId;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "code", nullable = false, unique = true)
    private String code;
    @Column(name = "number", nullable = false)
    private int number;
    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "state", nullable = false)
    private String state;

    public AddressModel(String address, String code, int number, String neighborhood, String city, String country, String state) {
        this.address = address;
        this.code = code;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }
}
