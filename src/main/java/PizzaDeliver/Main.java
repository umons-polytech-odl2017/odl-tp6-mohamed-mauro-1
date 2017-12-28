package PizzaDeliver;

public class Main {

    public static void main(String[] args){
        Pizza piz1=AbstractFactory.getFactory("Hut").createPizza("Prosciutto");
        Pan plus = new Pan();
        plus.DecoratePizza(piz1);
        System.out.println(piz1);
        System.out.println();

        Pizza piz2=AbstractFactory.getFactory("Hut").createPizza("Carbonara");
        Cheesy cheesy = new Cheesy();
        cheesy.DecoratePizza(piz2);
        System.out.println(piz2);
        System.out.println();

        Pizza piz3=AbstractFactory.getFactory("Domino").createPizza("Carbonara");
        System.out.println(piz3);
        System.out.println();
    }
}
