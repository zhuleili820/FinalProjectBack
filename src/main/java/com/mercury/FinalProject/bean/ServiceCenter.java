package com.mercury.FinalProject.bean;

import javax.persistence.*;

@Entity
@Table(name = "FINAL_SERVICE_CENTER")
public class ServiceCenter {

    @Id
    @SequenceGenerator(name = "final_service_center_seq_gen", sequenceName = "FINAL_SERVICE_CENTER_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "final_service_center_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private CustomerDetail customerDetail;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    private Service service;

    public ServiceCenter(){

    }

    public ServiceCenter(int id, CustomerDetail customerDetail, Service service) {
        this.id = id;
        this.customerDetail = customerDetail;
        this.service = service;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "ServiceCenter{" +
                "id=" + id +
                ", customerDetail=" + customerDetail +
                ", service=" + service +
                '}';
    }
}
