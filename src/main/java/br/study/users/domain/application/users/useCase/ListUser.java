package br.study.users.domain.application.users.useCase;

import br.study.users.domain.application.users.gateway.IRepositoryUser;
import br.study.users.domain.entity.users.UsersEntity;

import java.util.List;

public class ListUser {
    private IRepositoryUser repository;

    public ListUser(IRepositoryUser repository) {
        this.repository = repository;
    }

    public List<UsersEntity> listUser() {
        return repository.listUser();
    }
}
