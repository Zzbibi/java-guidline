package com.zz;

import com.zz.abstractfactory.TurkeyAdapter;
import com.zz.adapter.WildTurkey;
import com.zz.command.Light;
import com.zz.command.LightOnCommand;
import com.zz.command.SimpleRemoteControl;
import com.zz.decorator.Beverage;
import com.zz.decorator.Espresso;
import com.zz.decorator.Mocha;
import com.zz.decorator.Whip;
import com.zz.factorymethod.factory.ChicagoPizzaStore;
import com.zz.factorymethod.factory.NYPizzaStore;
import com.zz.factorymethod.pizza.NYStyleCheesePizza;
import com.zz.iterator.DinerMenu;
import com.zz.iterator.DinerMenuIterator;
import com.zz.iterator.PancakeHouseMenu;
import com.zz.iterator.Waitress;
import com.zz.observer.publisher.CurrentConditionDisplay;
import com.zz.observer.subscriber.WeatherData;
import com.zz.state.GumballMachine;
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

//        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
//        chicagoPizzaStore.orderPizza("cheese");
//        NYPizzaStore nyPizzaStore = new NYPizzaStore();
//        nyPizzaStore.orderPizza("cheese");

//        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
//
//        Light light = new Light();
//        LightOnCommand lightOnCommand = new LightOnCommand(light);
//
//        simpleRemoteControl.setCommand(lightOnCommand);
//        simpleRemoteControl.buttonWasPressed();

//        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(WildTurkey::new);
//        turkeyAdapter.quack();
//        turkeyAdapter.fly();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

<<<<<<< Updated upstream
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
=======
//        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
//        MenuComponent dinerMenu = new Menu("Diner menu", "Launch");
//        MenuComponent cafeMenu = new Menu("Cafe menu", "Diner");
//        MenuComponent dessertMenu = new Menu("Dessert menu", "Desert of course");
//
//        MenuComponent allMenus = new Menu("All menus", "All menu combined");
//        allMenus.add(pancakeHouseMenu);
//        allMenus.add(dinerMenu);
//        allMenus.add(cafeMenu);
//
//        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce",
//                true, 3.89));
//        dinerMenu.add(dessertMenu);
//
//        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust",
//                true, 1.59));
//
//        Waitress waitress = new Waitress(allMenus);
//        //waitress.printMenu();
//        waitress.printVagetarianMenu();

        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
>>>>>>> Stashed changes

    }

}
