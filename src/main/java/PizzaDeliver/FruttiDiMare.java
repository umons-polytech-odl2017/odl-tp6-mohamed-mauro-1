package PizzaDeliver;

public class FruttiDiMare extends Pizza {
    public FruttiDiMare() {
        super("Frutti Di Mare");
        Dough d = new Dough();
        TomatoSauce t = new TomatoSauce();
        Cheese c = new Cheese();
        Seafood s = new Seafood();
        this.addIngredient(d);
        this.addIngredient(t);
        this.addIngredient(c);
        this.addIngredient(s);
    }
}
