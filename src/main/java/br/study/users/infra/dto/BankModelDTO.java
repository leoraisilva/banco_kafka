package br.study.users.infra.dto;

import br.study.users.domain.entity.components.Account;

public record BankModelDTO(int numberBank, Account account, double mount, double limits) {
}
