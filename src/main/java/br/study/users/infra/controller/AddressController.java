package br.study.users.infra.controller;

import br.study.users.application.address.useCase.*;
import br.study.users.domain.entity.builders.AddressBuilder;
import br.study.users.infra.dto.AddressModelDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/addresses")
@CrossOrigin("*")
public class AddressController {
    private final AddressBuilder builder;
    private final CreateAddress createAddress;
    private final DeleteAddress deleteAddress;
    private final EditAddress editAddress;
    private final GetAddress getAddress;
    private final ListAddress listAddress;

    public AddressController(CreateAddress createAddress, DeleteAddress deleteAddress, EditAddress editAddress, GetAddress getAddress, ListAddress listAddress) {
        this.builder = new AddressBuilder();
        this.createAddress = createAddress;
        this.deleteAddress = deleteAddress;
        this.editAddress = editAddress;
        this.getAddress = getAddress;
        this.listAddress = listAddress;
    }

    @PostMapping
    public ResponseEntity<Object> createAddress(@RequestBody @Valid AddressModelDTO addressModelDTO) {
        builder.setAddress(addressModelDTO.address());
        builder.setCity(addressModelDTO.city());
        builder.setCodeAddress(addressModelDTO.codeAddress());
        builder.setCountry(addressModelDTO.country());
        builder.setNeighborhood(addressModelDTO.neighborhood());
        builder.setState(addressModelDTO.state());
        return ResponseEntity.status(HttpStatus.CREATED).body(createAddress.createAddress(builder.getResult()));
    }

    @GetMapping
    public ResponseEntity<Object> listAddress() {
        return ResponseEntity.status(HttpStatus.OK).body(listAddress.listAddress());
    }

    @GetMapping("/{codeAddress}")
    public ResponseEntity<Object> getAddress(@PathVariable String codeAddress) {
        return ResponseEntity.status(HttpStatus.OK).body(getAddress.getAddress(codeAddress));
    }

    @DeleteMapping("/{codeAddress}")
    public ResponseEntity<Object> deleteAddress(@PathVariable String codeAddress) {
        deleteAddress.deleteAddress(codeAddress);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
    }

    @PutMapping("/{codeAddress}")
    public ResponseEntity<Object> editAddress(@PathVariable String codeAddress, @RequestBody @Valid AddressModelDTO addressModelDTO) {
        builder.setAddress(addressModelDTO.address());
        builder.setCity(addressModelDTO.city());
        builder.setCodeAddress(addressModelDTO.codeAddress());
        builder.setCountry(addressModelDTO.country());
        builder.setNeighborhood(addressModelDTO.neighborhood());
        builder.setState(addressModelDTO.state());
        return ResponseEntity.status(HttpStatus.CREATED).body(editAddress.editAddress(codeAddress, builder.getResult()));
    }
}
