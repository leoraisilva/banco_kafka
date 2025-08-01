package br.study.users.infra.controller;

import br.study.users.application.users.useCase.*;
import br.study.users.domain.entity.builders.UserBuilder;
import br.study.users.infra.dto.UserModelDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
    private final CreateUser createUser;
    private final ListUser listUser;
    private final UserBuilder builder;
    private final GetUser getUser;
    private final DeleteUser deleteUser;
    private final EditUser editUser;

    public UserController(CreateUser createUser, ListUser listUser, GetUser getUser, DeleteUser deleteUser, EditUser editUser) {
        this.createUser = createUser;
        this.listUser = listUser;
        this.builder = new UserBuilder();
        this.getUser = getUser;
        this.deleteUser = deleteUser;
        this.editUser = editUser;
    }

    @PostMapping
    public ResponseEntity<Object> createUser (@RequestBody @Valid UserModelDTO userModelDTO){
        builder.setUsername(userModelDTO.username());
        builder.setPassword(userModelDTO.password());
        builder.setRules(userModelDTO.rules());
        builder.setDocument(userModelDTO.document());
        var users = createUser.createUser(builder.getResult());
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping
    public ResponseEntity<Object> listUser() {
        return ResponseEntity.status(HttpStatus.OK).body(listUser.listUser());
    }

    @GetMapping("/{username}")
    public ResponseEntity<Object> getUser (@PathVariable (value = "username") String username) {
        var user = getUser.getUser(username);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Object> deleteUser (@PathVariable (value = "username") String username) {
        deleteUser.deleteUser(username);
        return ResponseEntity.status(HttpStatus.OK).body("Delete Success!");
    }

    @PutMapping("/{username}")
    public ResponseEntity<Object> editUser (@PathVariable (value = "username") String username, @RequestBody @Valid UserModelDTO userModelDTO) {
        builder.setUsername(userModelDTO.username());
        builder.setPassword(userModelDTO.password());
        builder.setRules(userModelDTO.rules());
        builder.setDocument(userModelDTO.document());
        return ResponseEntity.status(HttpStatus.CREATED).body(editUser.editUser(username, builder.getResult()));
    }
}
