package br.study.users.infra.gateway;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.domain.entity.address.Address;
import br.study.users.infra.persistence.mapper.AddressMapper;

import java.util.List;
import java.util.stream.Collectors;

public class AddressModelRepository implements IAddressRepository {
    private final IAddressModelRepository repository;
    private final AddressMapper addressMapper;

    public AddressModelRepository(IAddressModelRepository repository, AddressMapper addressMapper) {
        this.repository = repository;
        this.addressMapper = addressMapper;
    }

    @Override
    public Address createAddress(Address address) {
        return addressMapper.toDomain(repository.save(addressMapper.toEntity(address)));
    }

    @Override
    public List<Address> listAddress() {
        return repository.findAll().stream()
                .map(addressMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Address getAddress(String codeAddress) {
        return addressMapper.toDomain(repository.findByCodeAddress(codeAddress));
    }

    @Override
    public Address editAddress(String codeAddress, Address address) {
        var addressModel = repository.findByCodeAddress(codeAddress);
        addressModel.setAddress(address.getAddress());
        addressModel.setCity(address.getCity());
        addressModel.setState(address.getState());
        addressModel.setCountry(address.getCountry());
        addressModel.setNeighborhood(address.getNeighborhood());
        addressModel.setCodeAddress(address.getCodeAddress());
        return addressMapper.toDomain(repository.save(addressModel));
    }

    @Override
    public void deleteAddress(String codeAddress) {
        repository.delete(repository.findByCodeAddress(codeAddress));
    }
}
