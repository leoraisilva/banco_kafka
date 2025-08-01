package br.study.users.infra.gateway;

import br.study.users.infra.persistence.model.BankModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBankModelRepository extends JpaRepository<BankModel, Integer> {
    BankModel findByNumberBank(int numberBank);
}
