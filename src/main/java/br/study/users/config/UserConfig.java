package br.study.users.config;

import br.study.users.application.users.gateway.IRepositoryUser;
import br.study.users.application.users.useCase.*;
import br.study.users.infra.gateway.IUserModelRepository;
import br.study.users.infra.gateway.UserModelRepository;
import br.study.users.infra.persistence.mapper.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUser createUser(IRepositoryUser repositoryUser) {
        return new CreateUser(repositoryUser);
    }

    @Bean
    GetUser getUser(IRepositoryUser repositoryUser) {
        return new GetUser(repositoryUser);
    }

    @Bean
    EditUser editUser(IRepositoryUser repositoryUser) {
        return new EditUser(repositoryUser);
    }

    @Bean
    ListUser listUser(IRepositoryUser repositoryUser) {
        return new ListUser(repositoryUser);
    }

    @Bean
    DeleteUser deleteUser(IRepositoryUser repositoryUser) {
        return new DeleteUser(repositoryUser);
    }

    @Bean
    UserModelRepository userModelRepository (IUserModelRepository repository, UserMapper userMapper) {
        return new UserModelRepository(repository, userMapper);
    }

    @Bean
    UserMapper userMapper() {
        return new UserMapper();
    }

}
