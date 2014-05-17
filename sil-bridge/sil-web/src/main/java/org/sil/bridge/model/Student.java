package org.sil.bridge.model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name="STUDENT_ID")
    @GeneratedValue
    private Integer studentId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="E_MAIL")
    private String email;

    @Column(name="HOME_ADDRESS")
    private String homeAddress;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.homeAddress = homeAddress;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer id) {
        this.studentId = id;
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
