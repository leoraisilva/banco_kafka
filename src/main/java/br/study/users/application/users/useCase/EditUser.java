package br.study.users.application.users.useCase;

import br.study.users.application.users.gateway.IRepositoryUser;
import br.study.users.domain.entity.users.UsersEntity;

public class EditUser {
    private IRepositoryUser repository;

    public EditUser(IRepositoryUser repository) {
        this.repository = repository;
    }

    public UsersEntity editUser(String username, UsersEntity entity) {
        return repository.editUser(username, entity);
    }

}
