package br.study.users.config;

import br.study.users.application.address.gateway.IAddressRepository;
import br.study.users.application.address.useCase.*;
import br.study.users.infra.gateway.AddressModelRepository;
import br.study.users.infra.gateway.IAddressModelRepository;
import br.study.users.infra.persistence.mapper.AddressMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean
    CreateAddress createAddress(IAddressRepository repository) {
        return new CreateAddress(repository);
    }

    @Bean
    DeleteAddress deleteAddress(IAddressRepository repository) {
        return new DeleteAddress(repository);
    }

    @Bean
    EditAddress editAddress(IAddressRepository repository) {
        return new EditAddress(repository);
    }

    @Bean
    GetAddress getAddress(IAddressRepository repository) {
        return new GetAddress(repository);
    }

    @Bean
    ListAddress listAddress(IAddressRepository repository) {
        return new ListAddress(repository);
    }

    @Bean
    AddressModelRepository addressModelRepository(IAddressModelRepository repository, AddressMapper mapper) {
        return new AddressModelRepository(repository, mapper);
    }

    @Bean
    AddressMapper addressMapper() {
        return new AddressMapper();
    }

}
