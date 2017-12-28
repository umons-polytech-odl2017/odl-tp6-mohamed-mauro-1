package PizzaDeliver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza implements PizzaComponent {

    private String name;
    private float price=0;
    private ArrayList<Ingredient> listIngredient = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        for(int i=0;i<listIngredient.size();i++){
            price += listIngredient.get(i).getPrice();
        }
        return price;
    }

    @Override
    public void setName(String n) {
        this.name=n;
    }

    @Override
    public void setPrice(float p) {
        this.price=p;
    }


    public ArrayList<Ingredient> getListIngredient() {
        return listIngredient;
    }

    public void addIngredient(Ingredient i){
        listIngredient.add(i);
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "name='" + name + '\'' +
            ", listIngredient=" + listIngredient + '\'' +
            ", Prix=" + price +
            '}';
    }
}
