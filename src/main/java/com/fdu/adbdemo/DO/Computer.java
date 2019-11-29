package com.fdu.adbdemo.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "computer")
public class Computer {
    @Id
    @Column(name = "id")
    private long ID;
    private long price;

    public Computer() {
    }

    public Computer(long ID, long price) {
        this.ID = ID;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ID=" + ID +
                ", price=" + price +
                '}';
    }
}
