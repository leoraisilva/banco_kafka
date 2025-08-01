package br.study.users.application.address.useCase;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.domain.entity.address.Address;

public class CreateAddress {
    private final IAddressRepository repository;

    public CreateAddress(IAddressRepository repository) {
        this.repository = repository;
    }

    public Address createAddress(Address address) {
        return repository.createAddress(address);
    }
}
