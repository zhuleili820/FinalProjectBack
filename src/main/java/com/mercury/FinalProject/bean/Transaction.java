package com.mercury.FinalProject.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "FINAL_TRANSACTION")
public class Transaction {

    @Id
    @SequenceGenerator(name = "final_transaction_seq_gen", sequenceName = "FINAL_TRANSACTION_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_transaction_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int inventory_id;

    @Column
    private String transaction_date;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private int price;

    @Column
    private String sales;


    public Transaction(){

    }

    public Transaction(int id, int inventory_id, String transaction_date, String name, String phone, String email,
                       int price, String sales) {
        this.id = id;
        this.inventory_id = inventory_id;
        this.transaction_date = transaction_date;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.price = price;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", inventory_id=" + inventory_id +
                ", transaction_date=" + transaction_date +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price +
                ", sales='" + sales + '\'' +
                '}';
    }
}
