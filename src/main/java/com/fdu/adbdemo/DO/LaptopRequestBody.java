package com.fdu.adbdemo.DO;

import java.util.List;

/**
 * Project Name: adb-demo
 * Created by HaoqiWu on 12/2/19.
 */
public class LaptopRequestBody {
    private List<String> brand;
    private List<String> cpu;
    private List<Integer> memory;
    private List<Integer> ssd;
    private List<Integer> hdd;
    private List<String> interval;
    private List<String> video_card;
    private List<String> video_memory;
    private List<Double> screen_size;
    private List<String> resolution;
    private String sort_policy;
    private boolean reverse;

    public LaptopRequestBody() {
    }

    public LaptopRequestBody(List<String> cpu) {
        this.cpu = cpu;
    }

    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }

    public List<String> getCpu() {
        return cpu;
    }

    public void setCpu(List<String> cpu) {
        this.cpu = cpu;
    }

    public List<Integer> getMemory() {
        return memory;
    }

    public void setMemory(List<Integer> memory) {
        this.memory = memory;
    }

    public List<Integer> getSsd() {
        return ssd;
    }

    public void setSsd(List<Integer> ssd) {
        this.ssd = ssd;
    }

    public List<Integer> getHdd() {
        return hdd;
    }

    public void setHdd(List<Integer> hdd) {
        this.hdd = hdd;
    }

    public List<String> getInterval() {
        return interval;
    }

    public void setInterval(List<String> interval) {
        this.interval = interval;
    }

    public List<String> getVideo_card() {
        return video_card;
    }

    public void setVideo_card(List<String> video_card) {
        this.video_card = video_card;
    }

    public List<String> getVideo_memory() {
        return video_memory;
    }

    public void setVideo_memory(List<String> video_memory) {
        this.video_memory = video_memory;
    }

    public List<Double> getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(List<Double> screen_size) {
        this.screen_size = screen_size;
    }

    public List<String> getResolution() {
        return resolution;
    }

    public void setResolution(List<String> resolution) {
        this.resolution = resolution;
    }

    public String getSort_policy() {
        return sort_policy;
    }

    public void setSort_policy(String sort_policy) {
        this.sort_policy = sort_policy;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    @Override
    public String toString() {
        return "LaptopRequestBody{" +
                "brand=" + brand +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", ssd=" + ssd +
                ", hdd=" + hdd +
                ", interval=" + interval +
                ", video_card=" + video_card +
                ", video_memory=" + video_memory +
                ", screen_size=" + screen_size +
                ", resolution=" + resolution +
                ", sort_policy='" + sort_policy + '\'' +
                ", reverse=" + reverse +
                '}';
    }
}
