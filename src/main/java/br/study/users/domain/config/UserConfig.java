package br.study.users.domain.config;

import br.study.users.domain.application.users.gateway.IRepositoryUser;
import br.study.users.domain.application.users.useCase.*;
import br.study.users.domain.entity.users.UsersEntity;
import br.study.users.domain.infra.gateway.IUserModelRepository;
import br.study.users.domain.infra.gateway.UserModelRepository;
import br.study.users.domain.infra.persistence.mapper.UserMapper;
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
