package com.mercury.FinalProject.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FINAL_SERVICE")
public class Service {

    @Id
    @SequenceGenerator(name = "final_service_seq_gen", sequenceName = "FINAL_SERVICE_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_service_seq_gen", strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int year;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private int mileage;
    @Column
    private int vin;
    @Column
    private String service;
    @Column
    private Date service_date;

    public Service(){

    }

    public Service(int id, int year, String make, String model,
                   int mileage, int vin, String service, Date service_date){
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.vin = vin;
        this.service = service;
        this.service_date = service_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getService_date() {
        return service_date;
    }

    public void setService_date(Date service_date) {
        this.service_date = service_date;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", vin=" + vin +
                ", service='" + service + '\'' +
                ", service_date=" + service_date +
                '}';
    }
}
