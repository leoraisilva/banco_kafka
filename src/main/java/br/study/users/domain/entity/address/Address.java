package br.study.users.domain.entity.address;

public class Address {
    private String address;
    private String code;
    private int number;
    private String neighborhood;
    private String city;
    private String country;
    private String state;

    public Address(String address, String code, int number, String neighborhood, String city, String country, String state) {
        this.address = address;
        this.code = code;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.country = country;
        this.state = state;
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
}
