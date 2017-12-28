package PizzaDeliver;

public class Carbonara extends Pizza {
    public Carbonara() {
        super("Carbonara");
        Dough d = new Dough();
        WhiteCream w = new WhiteCream();
        Cheese c = new Cheese();
        Ham h = new Ham();
        this.addIngredient(d);
        this.addIngredient(w);
        this.addIngredient(c);
        this.addIngredient(h);
    }
}
