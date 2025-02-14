package com.crud.crudClientes.dto;

public class ClientDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
