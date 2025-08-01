package br.study.users.infra.gateway;

import br.study.users.infra.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserModelRepository extends JpaRepository<UserModel, String> {
    UserModel findByUsername(String username);
}
