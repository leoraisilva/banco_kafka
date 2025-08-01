package br.study.users.infra.persistence.mapper;

import br.study.users.domain.entity.users.UsersEntity;
import br.study.users.infra.persistence.model.UserModel;

public class UserMapper {
    public UsersEntity toDomain (UserModel userModel) {
        return new UsersEntity(userModel.getUsername(), userModel.getPassword(), userModel.getRules(), userModel.getDocument());
    }

    public UserModel toEntity (UsersEntity users){
        return new UserModel(users.getUsername(), users.getPassword(), users.getRules(), users.getDocument(), 0, 0, "");
    }

    public UserModel toEntityAddress (UsersEntity users){
        return new UserModel(users.getUsername(), users.getPassword(), users.getRules(), users.getDocument(), 0, users.getNumberAddress(), users.getCodeAddress());
    }

    public UserModel toEntityBank (UsersEntity users){
        return new UserModel(users.getUsername(), users.getPassword(), users.getRules(), users.getDocument(), users.getNumberBank(), users.getNumberAddress(), users.getCodeAddress());
    }
}
