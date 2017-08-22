package com.walle.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mzwolinski on 8/4/17.
 */

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String street;
    private String homeNumber;
    private String flatNumber;
    private String city;
    private String postaCode;
    private Short type;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostaCode() {
        return postaCode;
    }

    public void setPostaCode(String postaCode) {
        this.postaCode = postaCode;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", city='" + city + '\'' +
                ", postaCode='" + postaCode + '\'' +
                ", type=" + type +
                ", userId=" + userId +
                '}';
    }
}
