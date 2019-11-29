package com.fdu.adbdemo.DO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ssd")
public class Ssd extends Hardware {
    @Id
    private Long id;

    public Ssd() {
    }
}
