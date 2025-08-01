package br.study.users.infra.dto;

import br.study.users.domain.entity.components.Rules;

public record UserModelDTO(String username, String password, Rules rules, String document) {
}
