package com.fdu.adbdemo.DO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ram")
public class Ram {
    @Id
    private Long id;
    private String title;
    private Long price;
    private Long shipping_fee;
    private String location;
    private String sold;
    private Long comment;

    public Ram() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(Long shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public Long getComment() {
        return comment;
    }

    public void setComment(Long comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", shipping_fee=" + shipping_fee +
                ", location='" + location + '\'' +
                ", sold='" + sold + '\'' +
                ", comment=" + comment +
                '}';
    }
}
