package com.yorsik.design.pattern.strategy.cases;

public enum OrderType {

    NORMAL(0,"普通订单"),
    GROUPON(1,"团购订单"),
    PROMOTION(2,"促销订单");

    public final Integer type;
    public final String value;

    OrderType(Integer type, String value) {
        this.type = type;
        this.value = value;
    }

}
