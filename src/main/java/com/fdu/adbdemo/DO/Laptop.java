package com.fdu.adbdemo.DO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project Name: adb-demo
 * Created by HaoqiWu on 12/2/19.
 */

@Entity
@Table(name = "combined_laptops")
public class Laptop implements Comparable{
    @Id
    private int id;
    private String product;
    private String series;
    private String brand;
    private String cpu;
    private int memory;
    private String video_card;
    private String video_memory;
    private double screen_size;
    private String resolution;
    private int ssd;
    private int hdd;
    private int price;
    private int sales;
    private String platform;
    private int round;
    private String interval;

    public Laptop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getVideo_card() {
        return video_card;
    }

    public void setVideo_card(String video_card) {
        this.video_card = video_card;
    }

    public String getVideo_memory() {
        return video_memory;
    }

    public void setVideo_memory(String video_memory) {
        this.video_memory = video_memory;
    }

    public double getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(double screen_size) {
        this.screen_size = screen_size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "product='" + product + '\'' +
                ", series='" + series + '\'' +
                ", brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory=" + memory +
                ", video_card='" + video_card + '\'' +
                ", video_memory='" + video_memory + '\'' +
                ", screen_size=" + screen_size +
                ", resolution='" + resolution + '\'' +
                ", ssd=" + ssd +
                ", hdd=" + hdd +
                ", price=" + price +
                ", sales=" + sales +
                ", platform='" + platform + '\'' +
                ", round=" + round +
                ", interval='" + interval + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getPrice()/ (this.getSales()==0? 1: this.getSales()) - ((Laptop)o).getPrice()/(((Laptop)o).getSales()+1);
    }
}
