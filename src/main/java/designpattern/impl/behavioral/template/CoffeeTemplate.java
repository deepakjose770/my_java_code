package designpattern.impl.behavioral.template;

public abstract class CoffeeTemplate {
    public final void makeCoffee() {
        takeCoffeePan();
        takeMilk();
        boilMilk();
        takeCoffeePowder();
        mixCoffeePowderAndMilk();
        pourToCup();
    }

    private final void pourToCup() {
        System.out.println("Pour the coffee to cup and serve");
    }

    private final void mixCoffeePowderAndMilk() {
        System.out.println("Mix coffee powder and Milk");
    }

    public abstract void takeCoffeePowder();

    private final void boilMilk() {
        System.out.println("Boil milk on gas stove");
    }

    public void takeMilk() {
        System.out.println("Get milk from shelf");
    }

    private final void takeCoffeePan() {
        System.out.println("Get my coffee pan");
    }


}
