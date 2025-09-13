# Criando uma aplicação em Clean Architecture
#
## A estrutura é o cadastro de um **API** com CRUD para os dados do Banco/Endereço/Usuario
##
## A estrutura segue a seguinte tree:

```
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.mb
└── src
    └── main
        ├── java
        │   └── br
        │       └── study
        │           └── users
        │               ├── application
        │               │   ├── address
        │               │   │   ├── gateway
        │               │   │   │   └── IAddressRepository.java
        │               │   │   └── useCase
        │               │   │       ├── CreateAddress.java
        │               │   │       ├── DeleteAddress.java
        │               │   │       ├── EditAddress.java
        │               │   │       ├── GetAddress.java
        │               │   │       └── ListAddress.java
        │               │   ├── bank
        │               │   │   ├── gateway
        │               │   │   │   └── IBankRepository.java
        │               │   │   └── userCase
        │               │   │       ├── CreateBank.java
        │               │   │       ├── DeleteBank.java
        │               │   │       ├── EditBank.java
        │               │   │       ├── GetBank.java
        │               │   │       └── ListBank.java
        │               │   └── users
        │               │       ├── gateway
        │               │       │   └── IRepositoryUser.java
        │               │       └── useCase
        │               │           ├── CreateUser.java
        │               │           ├── DeleteUser.java
        │               │           ├── EditUser.java
        │               │           ├── GetUser.java
        │               │           └── ListUser.java
        │               ├── config
        │               │   ├── AddressConfig.java
        │               │   ├── BankConfig.java
        │               │   └── UserConfig.java
        │               ├── domain
        │               │   └── entity
        │               │       ├── address
        │               │       │   └── Address.java
        │               │       ├── bank
        │               │       │   └── Bank.java
        │               │       ├── builders
        │               │       │   ├── AddressBuilder.java
        │               │       │   ├── BankBuilder.java
        │               │       │   ├── IAddressBuilder.java
        │               │       │   ├── IBankBuilder.java
        │               │       │   ├── IUserBuilder.java
        │               │       │   └── UserBuilder.java
        │               │       ├── components
        │               │       │   ├── Account.java
        │               │       │   └── Rules.java
        │               │       └── users
        │               │           └── UsersEntity.java
        │               ├── infra
        │               │   ├── controller
        │               │   │   ├── AddressController.java
        │               │   │   ├── BankController.java
        │               │   │   └── UserController.java
        │               │   ├── dto
        │               │   │   ├── AddressModelDTO.java
        │               │   │   ├── BankModelDTO.java
        │               │   │   └── UserModelDTO.java
        │               │   ├── gateway
        │               │   │   ├── AddressModelRepository.java
        │               │   │   ├── BankModelRepository.java
        │               │   │   ├── IAddressModelRepository.java
        │               │   │   ├── IBankModelRepository.java
        │               │   │   ├── IUserModelRepository.java
        │               │   │   └── UserModelRepository.java
        │               │   └── persistence
        │               │       ├── mapper
        │               │       │   ├── AddressMapper.java
        │               │       │   ├── BankMapper.java
        │               │       │   └── UserMapper.java
        │               │       └── model
        │               │           ├── AddressModel.java
        │               │           ├── BankModel.java
        │               │           └── UserModel.java
        │               └── UsersApplication.java
        └── resources
            └── application.properties

```
