package PizzaDeliver;

public class Cheesy extends DecoratorPizza {

    public Cheesy(){}

    @Override
    public Pizza DecoratePizza(Pizza p) {
        q=p;
        this.setName(p.getName());
        this.setPrice(p.getPrice());
        return q;
    }

    @Override
    public String getName() {
        return q.getName();
    }

    @Override
    public float getPrice() {
        return q.getPrice();
    }

    @Override
    public void setName(String n) {
        q.setName("Cheesy "+n);
    }

    @Override
    public void setPrice(float p) {
        q.setPrice(p+2f);
    }
}
