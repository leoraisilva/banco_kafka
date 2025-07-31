package br.study.users.domain.infra.gateway;

import br.study.users.domain.application.users.gateway.IRepositoryUser;
import br.study.users.domain.entity.users.UsersEntity;
import br.study.users.domain.infra.persistence.mapper.UserMapper;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UserModelRepository implements IRepositoryUser {

    private final IUserModelRepository repository;
    private final UserMapper userMapper;

    public UserModelRepository(IUserModelRepository repository, UserMapper userMapper) {
        this.repository = repository;
        this.userMapper = userMapper;
    }

    @Override
    public UsersEntity createUser(UsersEntity usersEntity) {
        return userMapper.toDomain(repository.save(userMapper.toEntity(usersEntity)));
    }

    @Override
    public List<UsersEntity> listUser() {
        return repository.findAll().stream()
                .map(userMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public UsersEntity getUser(String username) {
        return userMapper.toDomain(repository.findByUsername(username));
    }

    @Override
    public UsersEntity editUser(String username, UsersEntity usersEntity) {
        var usersModel = repository.findByUsername(username);
        usersModel.setUsername(usersEntity.getUsername());
        usersModel.setDocument(usersEntity.getDocument());
        usersModel.setRules(usersEntity.getRules());
        usersModel.setPassword(usersEntity.getPassword());
        return userMapper.toDomain(repository.save(usersModel));
    }

    @Override
    public void deleteUser(String username) {
        repository.delete(repository.findByUsername(username));
    }
}
