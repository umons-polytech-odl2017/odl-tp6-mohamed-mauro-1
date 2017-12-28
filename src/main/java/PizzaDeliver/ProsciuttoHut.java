package PizzaDeliver;

public class ProsciuttoHut extends Prosciutto {

    public ProsciuttoHut() {
        super();
        Olive o = new Olive();
        this.addIngredient(o);
    }
}
