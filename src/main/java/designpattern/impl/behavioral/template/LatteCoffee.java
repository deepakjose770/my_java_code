package designpattern.impl.behavioral.template;

public class LatteCoffee extends CoffeeTemplate{
    @Override
    public void takeCoffeePowder() {
        System.out.println("Take Latte Coffee powder from the shelf");
    }

    @Override
    public void takeMilk() {
        System.out.println("Get fresh milk from shelf for lattee");
    }
}
