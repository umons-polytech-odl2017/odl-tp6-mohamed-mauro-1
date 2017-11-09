public class Ingredients implements Food {

    private String name;
    private float price;

    public Ingredients(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }



}
