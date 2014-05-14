package org.sil.bridge.model;

import javax.persistence.*;

@Entity
@Table(name = "INDUSTRY")
public class Industry{

    @Id
    @Column(name="industryID")
    @GeneratedValue
    private Integer industryId;

    @Column(name="NAME")
    private String name;

    @Column(name="E_MAIL")
    private String email;

    @Column(name="ADDRESS")
    private String address;

    public Industry() {
    }

    public Industry(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return industryId;
    }

    public void setId(Integer id) {
        this.industryId = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
