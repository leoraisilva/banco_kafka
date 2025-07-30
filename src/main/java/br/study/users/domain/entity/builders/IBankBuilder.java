package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.components.Account;

public interface IBankBuilder {
    void setNumber(int number);
    void setAccount(Account account);
    void setMount(double mount);
    void setLimit(double limit);
}
