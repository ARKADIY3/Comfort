package com.example.Comfort.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class AdditionalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private Integer price;

    @ManyToMany(mappedBy = "additionalServices")
    private List<Orders> orders;

    public AdditionalService() {
    }

    public AdditionalService(List<Orders> orders, Integer price, String serviceName) {
        this.orders = orders;
        this.price = price;
        this.serviceName = serviceName;
    }

    public Long getId() {
        return id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public Integer getPrice() {
        return price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
