package br.study.users.infra.controller;

import br.study.users.application.bank.userCase.*;
import br.study.users.domain.entity.builders.BankBuilder;
import br.study.users.infra.dto.BankModelDTO;
import br.study.users.infra.persistence.model.BankModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bank")
@CrossOrigin("*")
public class BankController {
    private final BankBuilder builder;
    private final ListBank listBank;
    private final CreateBank createBank;
    private final GetBank getBank;
    private final DeleteBank deleteBank;
    private final EditBank editBank;

    public BankController(ListBank listBank, CreateBank createBank, GetBank getBank, DeleteBank deleteBank, EditBank editBank) {
        this.builder = new BankBuilder();
        this.listBank = listBank;
        this.createBank = createBank;
        this.getBank = getBank;
        this.deleteBank = deleteBank;
        this.editBank = editBank;
    }

    @PostMapping
    public ResponseEntity<Object> createBank(@RequestBody @Valid BankModelDTO bankModelDTO) {
        builder.setAccount(bankModelDTO.account());
        builder.setLimit(bankModelDTO.limits());
        builder.setMount(bankModelDTO.mount());
        builder.setNumberBank(bankModelDTO.numberBank());
        return ResponseEntity.status(HttpStatus.CREATED).body(createBank.createBank(builder.getResult()));
    }

    @GetMapping
    public ResponseEntity<Object> listBank() {
        return ResponseEntity.status(HttpStatus.OK).body(listBank.listBank());
    }

    @GetMapping("/{numberBank}")
    public ResponseEntity<Object> getBank(@PathVariable(value = "numberBank") int numberBank) {
        var bank = getBank.getBank(numberBank);
        return ResponseEntity.status(HttpStatus.OK).body(bank);
    }

    @PutMapping("/{numberBank}")
    public ResponseEntity<Object> editBank(@PathVariable(value = "numberBank") int numberBank, @RequestBody @Valid BankModelDTO bankModelDTO) {
        builder.setAccount(bankModelDTO.account());
        builder.setLimit(bankModelDTO.limits());
        builder.setMount(bankModelDTO.mount());
        builder.setNumberBank(bankModelDTO.numberBank());
        return ResponseEntity.status(HttpStatus.CREATED).body(editBank.editBank(numberBank, builder.getResult()));
    }

    @DeleteMapping("/{numberBank}")
    public ResponseEntity<Object> deleteBank(@PathVariable(value = "numberBank") int numberBank) {
        deleteBank.deleteBank(numberBank);
        return ResponseEntity.status(HttpStatus.OK).body("Delete Success!");
    }
}
