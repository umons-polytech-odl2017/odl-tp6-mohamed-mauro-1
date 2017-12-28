package PizzaDeliver;

public abstract class DecoratorPizza implements PizzaComponent{

    protected Pizza q;

    public abstract Pizza DecoratePizza(Pizza p);

}
