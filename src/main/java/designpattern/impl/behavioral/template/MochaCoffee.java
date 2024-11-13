package designpattern.impl.behavioral.template;

public class MochaCoffee extends CoffeeTemplate{

    @Override
    public void takeCoffeePowder() {
        System.out.println("Take Latte Coffee powder from the shelf");
    }
}
