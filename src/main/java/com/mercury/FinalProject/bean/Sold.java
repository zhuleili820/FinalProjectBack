package com.mercury.FinalProject.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "FINAL_SOLD")
public class Sold {

    @Id
    @SequenceGenerator(name = "final_sold_seq_gen", sequenceName = "FINAL_SOLD_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_sold_seq_gen", strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String image;
    @Column
    private int year;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private String engine;
    @Column
    private String transmission;
    @Column
    private int miles;
    @Column
    private String exterior;
    @Column
    private String interior;
    @Column
    private int price;
    @Column
    private String vin;
    @Column
    private String stock_number;
    @Column
    private String sales;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Transaction transaction;

    public Sold(){

    }

    public Sold(int id, String image, int year, String make, String model, String engine, String transmission, int miles, String exterior, String interior, int price, String vin, String stock_number, String sales, Transaction transaction) {
        this.id = id;
        this.image = image;
        this.year = year;
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.miles = miles;
        this.exterior = exterior;
        this.interior = interior;
        this.price = price;
        this.vin = vin;
        this.stock_number = stock_number;
        this.sales = sales;
        this.transaction = transaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getStock_number() {
        return stock_number;
    }

    public void setStock_number(String stock_number) {
        this.stock_number = stock_number;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Sold{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", miles=" + miles +
                ", exterior='" + exterior + '\'' +
                ", interior='" + interior + '\'' +
                ", price=" + price +
                ", vin='" + vin + '\'' +
                ", stock_number='" + stock_number + '\'' +
                ", sales='" + sales + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
