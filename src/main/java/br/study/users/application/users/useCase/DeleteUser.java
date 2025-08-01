package br.study.users.application.users.useCase;

import br.study.users.application.users.gateway.IRepositoryUser;

public class DeleteUser {
    private IRepositoryUser repository;

    public DeleteUser(IRepositoryUser repository) {
        this.repository = repository;
    }

    public void deleteUser (String username) {
        repository.deleteUser(username);
    }
}
