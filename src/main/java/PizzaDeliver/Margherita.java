package PizzaDeliver;

import java.awt.*;

public class Margherita extends Pizza {

    public Margherita() {
        super("Margherita");
        Dough d = new Dough();
        TomatoSauce t = new TomatoSauce();
        Cheese c = new Cheese();
        this.addIngredient(d);
        this.addIngredient(t);
        this.addIngredient(c);
    }
}
