package br.study.users.domain.application.users.gateway;

import br.study.users.domain.entity.users.UsersEntity;

import java.util.List;

public interface IRepositoryUser {
    UsersEntity createUser (UsersEntity usersEntity);
    List<UsersEntity> listUser();
    UsersEntity getUser(String username);
    UsersEntity editUser(String username, UsersEntity usersEntity);
    void deleteUser (String username);
}
