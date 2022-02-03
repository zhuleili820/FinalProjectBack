package com.mercury.FinalProject.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FINAL_CHECK_AVAILABILITY")
public class CheckAvailability {
    @Id
    @SequenceGenerator(name = "check_availability_seq_gen", sequenceName = "FINAL_CHECK_AVAILABILITY_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "check_availability_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    private Inventory inventory;

    @Column
    private String status;


    public CheckAvailability(){

    }

    public CheckAvailability(int id, Inventory inventory, String status) {
        this.id = id;
        this.inventory = inventory;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CheckAvailability{" +
                "id=" + id +
                ", inventory=" + inventory +
                ", status='" + status + '\'' +
                '}';
    }
}
