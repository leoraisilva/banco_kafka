package br.study.users.domain.entity.builders;

public interface IAddressBuilder {
    void setAddress(String address) ;
    void setCodeAddress(String codeAddress);
    void setNeighborhood(String neighborhood) ;
    void setCity(String city) ;
    void setCountry(String country) ;
    void setState(String state);
}
