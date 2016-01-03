package com.domain;
// Generated Dec 21, 2015 1:36:36 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customer"
    ,catalog="carrepairinvoicing"
)
public class Customer  implements java.io.Serializable {

    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="CustomerNo", unique=true, nullable=false)
    private int customerNo;
    @Column(name="LastName", length=45)
    private String lastName;
    @Column(name="FirstName", length=45)
    private String firstName;
    @Column(name="Street", length=45)
    private String street;
    @Column(name="State", length=100)
    private String state;
    @Column(name="City", length=45)
    private String city;
    @Column(name="MobileNo", length=45)
    private String mobileNo;
    @Column(name="HomeNumber", length=45)
    private String homeNumber;    
    @Column(name="WorkNumber", length=45)
    private String workNumber;
    @Column(name="EmailAd", length=100)
    private String emailAd;
    @Temporal(TemporalType.DATE)
    @Column(name="Birthday", length=10)
    private Date birthday;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    private Set<Vehicle> vehicles = new HashSet<Vehicle>(0);

    public Customer() {
    }

	
    public Customer(int customerNo) {
        this.customerNo = customerNo;
    }
    
    public Customer(int customerNo, String lastName, String firstName, String street, String state, String city, String mobileNo, String homeNumber, String workNumber, String emailAd ,Date birthday, Set<Vehicle> vehicles) {
       this.customerNo = customerNo;
       this.lastName = lastName;
       this.firstName = firstName;
       this.street = street;
       this.state = state;
       this.city = city;
       this.mobileNo = mobileNo;
       this.homeNumber = homeNumber;
       this.workNumber = workNumber;
       this.emailAd = emailAd;
       this.birthday = birthday;
       this.vehicles = vehicles;
    }
    
    public Customer(String lastName, @NotNull String firstName, String street, String state, String city, String mobileNo, String homeNumber, String workNumber, String emailAd ,Date birthday) {
       this.lastName = lastName;
       this.firstName = firstName;
       this.street = street;
       this.state = state;
       this.city = city;
       this.mobileNo = mobileNo;
       this.homeNumber = homeNumber;
       this.workNumber = workNumber;
       this.emailAd = emailAd;
       this.birthday = birthday;
    }
   
    public int getCustomerNo() {
        return this.customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }
    
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getHomeNumber() {
        return this.homeNumber;
    }
    
    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
    
    public String getWorkNumber() {
        return this.workNumber;
    }
    
    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
    
    public String getEmailAd() {
        return this.emailAd;
    }
    
    public void setEmailAd(String emailAd) {
        this.emailAd = emailAd;
    }
    
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Set<Vehicle> getVehicles() {
        return this.vehicles;
    }
    
    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}


