package com.mercury.FinalProject.bean;

import javax.persistence.*;

@Entity
@Table(name = "FINAL_TRADEIN")
public class TradeIn {

    @Id
    @SequenceGenerator(name = "final_tradeIn_seq_gen", sequenceName = "FINAL_TRADEIN_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_tradeIn_seq_gen", strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String email;
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
    private int payoff_balance;

    public TradeIn(){

    }


    public TradeIn(int id, String name, String phone, String email, int year, String make, String model, int miles,
                   String vin, int payoff_balance) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.vin = vin;
        this.payoff_balance = payoff_balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getPayoff_balance() {
        return payoff_balance;
    }

    public void setPayoff_balance(int payoff_balance) {
        this.payoff_balance = payoff_balance;
    }

    @Override
    public String toString() {
        return "TradeIn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", vin='" + vin + '\'' +
                ", payoff_balance=" + payoff_balance +
                '}';
    }
}
