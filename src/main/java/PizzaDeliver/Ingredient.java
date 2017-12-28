package PizzaDeliver;

public class Ingredient implements PizzaComponent {

    private String name;
    private float price;

    public Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
