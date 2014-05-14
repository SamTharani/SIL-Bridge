package org.sil.bridge.model;

import javax.persistence.*;

@Entity
@Table(name = "LECTURER")
public class Lecturer {
    @Id
    @Column(name="lecturerID")
    @GeneratedValue
    private Integer lecturerId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="E_MAIL")
    private String email;

    @Column(name="HOME_ADDRESS")
    private String homeAddress;


    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName, String email, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.homeAddress = homeAddress;
    }

    public Integer getId() {
        return lecturerId;
    }

    public void setId(Integer id) {
        this.lecturerId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
