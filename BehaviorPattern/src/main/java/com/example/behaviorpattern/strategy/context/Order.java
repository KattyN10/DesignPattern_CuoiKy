package com.example.behaviorpattern.strategy.context;

import com.example.behaviorpattern.strategy.strategies.PayStrategy;

public class Order {

    public void processOrder(PayStrategy strategy) {
        strategy.pay();

    }
}
