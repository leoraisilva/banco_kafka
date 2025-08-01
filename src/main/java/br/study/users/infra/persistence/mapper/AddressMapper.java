package br.study.users.infra.persistence.mapper;

import br.study.users.domain.entity.address.Address;
import br.study.users.infra.persistence.model.AddressModel;

public class AddressMapper {
    public Address toDomain(AddressModel addressModel) {
        return new Address(addressModel.getAddress(), addressModel.getCodeAddress(), addressModel.getNeighborhood(), addressModel.getCity(), addressModel.getCountry(), addressModel.getState());
    }
    public AddressModel toEntity(Address address) {
        return new AddressModel(address.getAddress(), address.getCodeAddress(), address.getNeighborhood(), address.getCity(), address.getCountry(), address.getState());
    }
}
