package com.yorsik.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    /**
     * 无状态的实现例子
     * 这样的策略对象时可以被共享使用的，不需要在每次getStrategy()的时候，都创建一个
     * 新的策略对象，针对这种情况，我们可以使用如下的实现方式
     * 事先创建好每个策略对象，缓存到工厂类中，用的时候直接返回
     *
     *
     */
    private static final Map<String,Strategy> strategies = new HashMap<>();

    static{
        strategies.put("A",new ConcreteStrategaA());
        strategies.put("B",new ConcreteStrategaB());
    }

    public static Strategy getStrategy(String type){
        if(type == null || type.isEmpty()){
            try {
                throw new IllegalAccessException("type should not be empty.");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return strategies.get(type);
    }

    /**
     * 有状态的实现方式
     * 根据业务场景的需要，我们希望每次从工厂方法中，获得的都是新创建的策略对象，
     * 而不是缓存好可共享的策略对象，可以使用如下的实现方式
     */
    /*public static Strategy getStrategy(String type){

        if(type == null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty.");
        }

        if (type.equals("A")){
            return new ConcreteStrategaA();
        }else if(type.equals("B")){
            return new ConcreteStrategaB();
        }
        return null;
    }*/

}
