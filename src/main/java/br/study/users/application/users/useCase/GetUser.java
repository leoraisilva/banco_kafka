package br.study.users.application.users.useCase;

import br.study.users.application.users.gateway.IRepositoryUser;
import br.study.users.domain.entity.users.UsersEntity;

public class GetUser {
    private IRepositoryUser repository;

    public GetUser(IRepositoryUser repository) {
        this.repository = repository;
    }

    public UsersEntity getUser(String username) {
        return repository.getUser(username);
    }
}
