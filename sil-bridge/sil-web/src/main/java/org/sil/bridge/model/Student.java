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

    @Column(name="GENDER")
    private String gender;

    @Column(name="DATE_of_BIRTH")
    private String dob;

    @Column(name="UNIVERSITY")
    private String university;

    @Column(name="FACULTY")
    private String faculty;

    @Column(name="COURSE")
    private String course;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String repassword;



    public Student() {
    }

    public Student(String firstName, String lastName,
                   String email, String homeAddress,
                   String gender, String dob,
                   String university, String faculty,
                   String course, String username, String repassword)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.homeAddress = homeAddress;
        this.gender = gender;
        this.dob = dob;
        this.university = university;
        this.faculty = faculty;
        this.course = course;
        this.username = username;
        this.repassword = repassword;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}
