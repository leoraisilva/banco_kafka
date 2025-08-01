package br.study.users.application.address.useCase;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.domain.entity.address.Address;

public class GetAddress {

    private final IAddressRepository repository;

    public GetAddress(IAddressRepository repository) {
        this.repository = repository;
    }

    public Address getAddress(String codeAddress) {
        return repository.getAddress(codeAddress);
    }
}
