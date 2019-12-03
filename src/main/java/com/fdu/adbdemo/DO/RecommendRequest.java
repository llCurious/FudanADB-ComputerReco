package com.fdu.adbdemo.DO;

/**
 * Project Name: adb-demo
 * Created by HaoqiWu on 12/2/19.
 */
public class RecommendRequest {
    private String scenario;
    private String sort_policy;
    private boolean reverse;

    public RecommendRequest() {
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
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
}
