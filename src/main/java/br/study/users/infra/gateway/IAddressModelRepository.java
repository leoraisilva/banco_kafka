package br.study.users.infra.gateway;

import br.study.users.infra.persistence.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressModelRepository extends JpaRepository<AddressModel, String> {
    AddressModel findByCodeAddress(String codeAddress);
}
