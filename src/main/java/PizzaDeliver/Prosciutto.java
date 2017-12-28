package PizzaDeliver;

public class Prosciutto extends Pizza {

    public Prosciutto() {
        super("Prosciutto");
        Dough d = new Dough();
        TomatoSauce t = new TomatoSauce();
        Cheese c = new Cheese();
        Ham h = new Ham();
        this.addIngredient(d);
        this.addIngredient(t);
        this.addIngredient(c);
        this.addIngredient(h);
    }
}
