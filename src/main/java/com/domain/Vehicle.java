package com.domain;
// Generated Dec 21, 2015 1:36:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Vehicle generated by hbm2java
 */
@Entity
@Table(name="vehicle"
    ,catalog="carrepairinvoicing"
)
public class Vehicle  implements java.io.Serializable {
    
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="VehicleNo", unique=true, nullable=false)
    private Integer vehicleNo;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OwnerID", nullable=false)
    private Customer customer;
    @Column(name="RegistrationNo", length=45)
    private String registrationNo;
    @Column(name="ModelNo", length=45)
    private String modelNo;
    @Column(name="Carline", length=45)
    private String carline;
    @Column(name="Engine", length=45)
    private String engine;
    @Column(name="ChassisNo", length=45)
    private String chassisNo;
    @Column(name="Kilometers", length=45)
    private String kilometers;
    @Column(name="YrMakeModel", length=100)
    private String yrMakeModel;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="vehicle")
    private Set<Invoice> invoices = new HashSet<Invoice>(0);

    public Vehicle() {
    }

	
    public Vehicle(Customer customer) {
        this.customer = customer;
    }
    public Vehicle(Customer customer, String registrationNo, String modelNo, String carline, String engine, String chassisNo, String kilometers, String yrMakeModel, Set<Invoice> invoices) {
        this.customer = customer;
        this.registrationNo = registrationNo;
        this.modelNo = modelNo;
        this.carline = carline;
        this.engine = engine;
        this.chassisNo = chassisNo;
        this.kilometers = kilometers;
        this.yrMakeModel = yrMakeModel;
        this.invoices = invoices;
    }
   
    public Integer getVehicleNo() {
        return this.vehicleNo;
    }
    
    public void setVehicleNo(Integer vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRegistrationNo() {
        return this.registrationNo;
    }
    
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getModelNo() {
        return this.modelNo;
    }
    
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    
    public String getCarline() {
        return this.carline;
    }
    
    public void setCarline(String carline) {
        this.carline = carline;
    }

    public String getEngine() {
        return this.engine;
    }
    
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getChassisNo() {
        return this.chassisNo;
    }
    
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    
    public String getKilometers() {
        return this.kilometers;
    }
    
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getYrMakeModel() {
        return this.yrMakeModel;
    }
    
    public void setYrMakeModel(String yrMakeModel) {
        this.yrMakeModel = yrMakeModel;
    }

    public Set<Invoice> getInvoices() {
        return this.invoices;
    }
    
    public void setInvoices(Set<Invoice> invoices) {
        this.invoices = invoices;
    }
}