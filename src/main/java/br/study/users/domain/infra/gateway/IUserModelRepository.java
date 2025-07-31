package br.study.users.domain.infra.gateway;

import br.study.users.domain.entity.users.UsersEntity;
import br.study.users.domain.infra.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserModelRepository extends JpaRepository<UserModel, String> {
    UserModel findByUsername(String username);
}
