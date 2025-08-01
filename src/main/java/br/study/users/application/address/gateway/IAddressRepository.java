package br.study.users.application.address.gateway;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;

import java.util.List;

public interface IAddressRepository {
    Address createAddress (Address address);
    List<Address> listAddress();
    Address getAddress(String codeAddress);
    Address editAddress(String codeAddress, Address address);
    void deleteAddress(String codeAddress);
}
