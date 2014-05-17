package org.sil.bridge.model;

import javax.persistence.*;

@Entity
@Table(name = "INDUSTRY")
public class Industry{

    @Id
    @Column(name = "INDUSTRY_ID")
    @GeneratedValue
    private Integer industryId;

    @Column(name="NAME")
    private String name;

    @Column(name="E_MAIL")
    private String email;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="GENDER")
    private String gender;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String repassword;

    @Column(name="WEB")
    private String webid;

    @Column(name="PAYMENT")
    private String payment;

    public Industry() {
    }

    public Industry(String name, String email,
                    String gender, String address,
                    String username, String repassword,
                    String webid, String payment)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.username = username;
        this.repassword = repassword;
        this.webid = webid;
        this.payment = payment;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer id) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getWebid() {
        return webid;
    }

    public void setWebid(String webid) {
        this.webid = webid;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
