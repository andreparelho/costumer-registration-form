package com.andreparelho.backendchallenge.entity;

import java.util.List;

public class ClientEntity {
    private String name;
    private String email;
    private String phone;
    private String companyName;
    private List<CompanyServices> companyServicesList;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<CompanyServices> getCompanyServicesList() {
        return companyServicesList;
    }

    public void setCompanyServicesList(List<CompanyServices> companyServicesList) {
        this.companyServicesList = companyServicesList;
    }
}
