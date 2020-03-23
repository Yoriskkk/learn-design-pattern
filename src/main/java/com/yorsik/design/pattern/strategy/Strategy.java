package com.yorsik.design.pattern.strategy;

/**
 * 策略类的定义：
 *      一个策略接口和一组实现这个接口的策略impl类。所有的策略类都实现相同接口
 *      客户端代码基于接口而非实现编程
 */
public interface Strategy {

    void algorithmInterface();

}
