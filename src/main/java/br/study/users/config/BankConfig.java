package br.study.users.config;

import br.study.users.application.bank.gateway.IBankRepository;
import br.study.users.application.bank.userCase.*;
import br.study.users.infra.gateway.BankModelRepository;
import br.study.users.infra.gateway.IBankModelRepository;
import br.study.users.infra.persistence.mapper.BankMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

    @Bean
    CreateBank createBank(IBankRepository repository) {
        return new CreateBank(repository);
    }

    @Bean
    DeleteBank deleteBank(IBankRepository repository) {
        return new DeleteBank(repository);
    }

    @Bean
    EditBank editBank(IBankRepository repository) {
        return new EditBank(repository);
    }

    @Bean
    GetBank getBank(IBankRepository repository) {
        return new GetBank(repository);
    }

    @Bean
    ListBank listBank(IBankRepository repository) {
        return new ListBank(repository);
    }

    @Bean
    BankModelRepository bankModelRepository(IBankModelRepository repository, BankMapper mapper){
        return new BankModelRepository(repository, mapper);
    }

    @Bean
    BankMapper bankMapper() {
        return new BankMapper();
    }

}
