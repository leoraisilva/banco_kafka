package br.study.users.application.address.useCase;

import br.study.users.application.address.gateway.IAddressRepository;

public class DeleteAddress {

    private final IAddressRepository repository;

    public DeleteAddress(IAddressRepository repository) {
        this.repository = repository;
    }

    public void deleteAddress(String codeAddress) {
        repository.deleteAddress(codeAddress);
    }
}
