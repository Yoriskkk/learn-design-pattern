package com.yorsik.design.pattern.strategy.cases;

import com.yorsik.design.pattern.strategy.Order;
import com.yorsik.design.pattern.strategy.cases.OrderType;

public class OrderService {

    /**
     * 在这个例子中，没有使用策略模式，而是将策略的定义、创建、使用直接耦合在一起
     * @param order
     * @return
     */
    public double discount1(Order order){

        double discount = 0.0;
        OrderType type = order.getType();
        if(type.equals(OrderType.NORMAL)){
            //省略普通订单折扣代码
        }else if (type.equals(OrderType.GROUPON)){
            //省略团购订单折扣代码
        }else if (type.equals(OrderType.PROMOTION)){
            //省略促销订单折扣代码
        }

        return discount;
    }

    public double discount2(Order order){

        OrderType type = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }

}
