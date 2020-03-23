package com.yorsik.design.pattern.strategy.cases;

import com.yorsik.design.pattern.strategy.Order;

//策略的定义
public interface DiscountStrategy {

    double calDiscount(Order order);

}
