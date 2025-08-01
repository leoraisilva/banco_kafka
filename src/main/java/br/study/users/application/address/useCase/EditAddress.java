package br.study.users.application.address.useCase;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.domain.entity.address.Address;

public class EditAddress {

    private final IAddressRepository repository;

    public EditAddress(IAddressRepository repository) {
        this.repository = repository;
    }

    public Address editAddress(String codeAddress, Address address) {
        return repository.editAddress(codeAddress, address);
    }
}
