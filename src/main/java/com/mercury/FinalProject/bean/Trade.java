package com.mercury.FinalProject.bean;

import javax.persistence.*;

@Entity
@Table(name = "FINAL_TRADE")
public class Trade {

    @Id
    @SequenceGenerator(name = "final_trade_seq_gen", sequenceName = "FINAL_TRADE_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_trade_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private CustomerDetail customerDetail;

    @Column
    private int year;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private int miles;
    @Column
    private String vin;
    @Column
    private int payOffBalance;

    public Trade(){

    }

    public Trade(int id, CustomerDetail customerDetail, int year, String make, String model, int miles, String vin, int payOffBalance) {
        this.id = id;
        this.customerDetail = customerDetail;
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.vin = vin;
        this.payOffBalance = payOffBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
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

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getPayOffBalance() {
        return payOffBalance;
    }

    public void setPayOffBalance(int payOffBalance) {
        this.payOffBalance = payOffBalance;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", customerDetail=" + customerDetail +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", vin='" + vin + '\'' +
                ", payOffBalance=" + payOffBalance +
                '}';
    }
}
