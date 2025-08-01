package br.study.users.application.address.useCase;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.domain.entity.address.Address;

import java.util.List;

public class ListAddress {
    private final IAddressRepository repository;

    public ListAddress(IAddressRepository repository) {
        this.repository = repository;
    }

    public List<Address> listAddress() {
        return repository.listAddress();
    }
}
