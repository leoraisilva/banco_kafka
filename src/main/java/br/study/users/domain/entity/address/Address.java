package br.study.users.domain.entity.address;

public class Address {
    private String address;
    private String codeAddress;
    private String neighborhood;
    private String city;
    private String country;
    private String state;

    public Address(String address, String codeAddress, String neighborhood, String city, String country, String state) {
        this.address = address;
        this.codeAddress = codeAddress;
        this.neighborhood = neighborhood;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public String getCodeAddress() {
        return codeAddress;
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
}
