package com.fdu.adbdemo.DO;

import javax.persistence.Id;

public class Hardware {
    @Id
    private Long id;
    private String title;
    private Long price;
    private Long shippingFee;
    private String location;
    private String sold;
    private Long comment;

    public Hardware() {
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

    public Long getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Long shippingFee) {
        this.shippingFee = shippingFee;
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
        return "Hardware{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", shippingFee=" + shippingFee +
                ", location='" + location + '\'' +
                ", sold='" + sold + '\'' +
                ", comment=" + comment +
                '}';
    }
}
