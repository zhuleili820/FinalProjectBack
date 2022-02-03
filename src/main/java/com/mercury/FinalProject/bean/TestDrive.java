package com.mercury.FinalProject.bean;

import javax.persistence.*;

@Entity
@Table(name = "FINAL_TEST_DRIVE")
public class TestDrive {
    @Id
    @SequenceGenerator(name = "final_test_drive_seq_gen", sequenceName = "FINAL_TEST_DRIVE_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_test_drive_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private CustomerDetail customerDetail;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private CheckAvailability checkAvailability;

    @Column
    private String test_drive_status;

    public TestDrive(){

    }

    public TestDrive(int id, CustomerDetail customerDetail, CheckAvailability checkAvailability, String test_drive_status) {
        this.id = id;
        this.customerDetail = customerDetail;
        this.checkAvailability = checkAvailability;
        this.test_drive_status = test_drive_status;
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

    public CheckAvailability getCheckAvailability() {
        return checkAvailability;
    }

    public void setCheckAvailability(CheckAvailability checkAvailability) {
        this.checkAvailability = checkAvailability;
    }

    public String getTest_drive_status() {
        return test_drive_status;
    }

    public void setTest_drive_status(String test_drive_status) {
        this.test_drive_status = test_drive_status;
    }

    @Override
    public String toString() {
        return "TestDrive{" +
                "id=" + id +
                ", customerDetail=" + customerDetail +
                ", checkAvailability=" + checkAvailability +
                ", test_drive_status='" + test_drive_status + '\'' +
                '}';
    }
}
