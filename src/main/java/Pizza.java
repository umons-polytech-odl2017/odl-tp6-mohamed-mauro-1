import java.util.*;

public class Pizza implements Food {

    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    Collection<Food> foods = new ArrayList<Food>(){};


    public String getName() {
        return name;
    }


    public float getPrice() {
        return 0;
    }

    public void add(Food food) {
        foods.add(food);
    }

    public void remove(Food food){
        foods.remove(food);
    }
}
