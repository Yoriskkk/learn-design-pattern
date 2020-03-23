package com.yorsik.design.pattern.strategy;
import com.yorsik.design.pattern.strategy.cases.OrderType;
import lombok.Data;
@Data
public class Order {

    private OrderType type;

}
