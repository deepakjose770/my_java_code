package designpattern.impl.behavioral.template;

public class CoffeeMaker {
    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new LatteCoffee();
        coffeeType.makeCoffee();
        System.out.println();
        System.out.println();
        coffeeType = new MochaCoffee();
        coffeeType.makeCoffee();
    }
}
