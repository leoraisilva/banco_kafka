package br.study.users.domain.application.users.gateway;

import br.study.users.domain.entity.users.UsersEntity;

import java.util.List;

public interface IRepositoryUser {
    UsersEntity createUser ();
    List<UsersEntity> listUser();
    UsersEntity getUser(String username);
    UsersEntity editUser(String username);
    void deleteUser (String username);
}
