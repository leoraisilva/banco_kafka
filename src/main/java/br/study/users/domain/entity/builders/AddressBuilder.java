package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.address.Address;

public class AddressBuilder implements IAddressBuilder{
    private String address;
    private String code;
    private String neighborhood;
    private String city;
    private String country;
    private String state;

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    public Address getResult() {
        return new Address(this.address, this.code, this.neighborhood, this.city, this.country, this.state);
    }
}
