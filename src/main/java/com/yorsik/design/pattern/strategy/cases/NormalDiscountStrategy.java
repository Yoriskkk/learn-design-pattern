package com.yorsik.design.pattern.strategy.cases;

import com.yorsik.design.pattern.strategy.Order;

public class NormalDiscountStrategy implements DiscountStrategy{
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
