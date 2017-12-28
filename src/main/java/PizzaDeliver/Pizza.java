package PizzaDeliver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza implements PizzaComponent {

    private String name;
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
        float price=0;
        for(int i=0;i<listIngredient.size();i++){
            price += listIngredient.get(i).getPrice();
        }
        return price;
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
            ", Prix=" + this.getPrice() +
            '}';
    }
}
