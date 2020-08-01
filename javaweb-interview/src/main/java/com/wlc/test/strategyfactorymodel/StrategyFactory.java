package com.wlc.test.strategyfactorymodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:定义工厂类
 */
public class StrategyFactory {
    private Map<Integer, Strategy> map;
    private static StrategyFactory strategyFactory;

    private StrategyFactory() {
        // 在工厂类的构造方法中添加所有的策略类，然后放入到List中、
        List<Strategy> strategies = new ArrayList<>();
        strategies.add(new SilverStrategy());
        strategies.add(new PlatinumStrategy());
        strategies.add(new OrdinaryStrategy());
        strategies.add(new GoldStrategy());

        // 把List循环添加到map中
        // 第一种方法
        map = new HashMap<>();
        for (Strategy strategy : strategies) {
            map.put(strategy.getType(), strategy);
        }
        // 第二种方法
        //map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));
        // 这两种方法一样，但是第2种方法更简洁
    }


    /**
     * 获得唯一工厂实力类 (懒汉（单例模式）)
     */
    public static synchronized StrategyFactory getInstance() {
        if(null == strategyFactory){
            strategyFactory = new StrategyFactory();
        }
        return strategyFactory;
    }

    public Strategy get(Integer type) {
        return map.get(type);
    }


}
