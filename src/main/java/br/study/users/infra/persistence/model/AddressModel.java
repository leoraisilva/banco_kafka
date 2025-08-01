package br.study.users.infra.persistence.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String addressId;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "code_address", nullable = false, unique = true)
    private String codeAddress;
    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "state", nullable = false)
    private String state;

    public AddressModel(String address, String codeAddress, String neighborhood, String city, String country, String state) {
        this.address = address;
        this.codeAddress = codeAddress;
        this.neighborhood = neighborhood;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public AddressModel() {}

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCodeAddress() {
        return codeAddress;
    }

    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
