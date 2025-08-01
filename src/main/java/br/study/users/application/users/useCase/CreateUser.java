package br.study.users.application.users.useCase;

import br.study.users.application.users.gateway.IRepositoryUser;
import br.study.users.domain.entity.users.UsersEntity;

public class CreateUser {
    private IRepositoryUser repository;

    public CreateUser(IRepositoryUser repository) {
        this.repository = repository;
    }

    public UsersEntity createUser (UsersEntity usersEntity){
        return repository.createUser(usersEntity);
    }
}
