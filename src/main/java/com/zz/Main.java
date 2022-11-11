package com.zz;

import com.zz.observer.publisher.CurrentConditionDisplay;
import com.zz.observer.subscriber.WeatherData;
import com.zz.strategy.Duck;
import com.zz.strategy.MallardDuck;
import com.zz.strategy.ModelDuck;
import com.zz.strategy.behavior.fly.FlyRocketPowered;

/**
 * @Author zhangzhen
 * @create 2022/11/11 17:35
 */
public class Main {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuake();
//
//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(13f, 13f, 13f);
    }

}
