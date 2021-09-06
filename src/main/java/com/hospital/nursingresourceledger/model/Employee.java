package com.hospital.nursingresourceledger.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Boolean inactive;

    public Employee() {

    }

    public Employee(Long id, String name, String email, String phone, Boolean inactive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.inactive = inactive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }
}
