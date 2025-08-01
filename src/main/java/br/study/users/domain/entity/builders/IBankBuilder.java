package br.study.users.domain.entity.builders;

import br.study.users.domain.entity.components.Account;

public interface IBankBuilder {
    void setNumberBank(int numberBank);
    void setAccount(Account account);
    void setMount(double mount);
    void setLimit(double limit);
}
