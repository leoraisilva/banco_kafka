package br.study.users.domain.infra.dto;

import br.study.users.domain.entity.address.Address;
import br.study.users.domain.entity.bank.Bank;
import br.study.users.domain.entity.components.Rules;

public record UserModelDTO(String username, String password, Rules rules, String document) {
}
