package com.fdu.adbdemo.DO;

import java.util.List;

/**
 * Project Name: adb-demo
 * Created by HaoqiWu on 12/2/19.
 */
public class SmallRequest {
    private List<String> cpu;
    private String ssd;

    public SmallRequest() {
    }

    public List<String> getCpu() {
        return cpu;
    }

    public void setCpu(List<String> cpu) {
        this.cpu = cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}
