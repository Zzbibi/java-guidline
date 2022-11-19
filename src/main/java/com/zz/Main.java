package com.zz;

import com.zz.decorator.Beverage;
import com.zz.decorator.Espresso;
import com.zz.decorator.Mocha;
import com.zz.decorator.Whip;
import com.zz.factorymethod.factory.ChicagoPizzaStore;
import com.zz.factorymethod.factory.NYPizzaStore;
import com.zz.factorymethod.pizza.NYStyleCheesePizza;
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

//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
//        weatherData.setMeasurements(13f, 13f, 13f);

//        Beverage beverage = new Espresso();
//        beverage = new Mocha(beverage);
//        beverage = new Whip(beverage);
//        beverage = new Whip(beverage);
//        System.out.println("description:" + beverage.getDescription());
//        System.out.println("price:$" + beverage.cost());

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }

}
