package PizzaDeliver;

public class Main {

    public static void main(String[] args){

        AbstractFactory.getFactory("Hut");
        AbstractFactory.getFactory("Dominos");

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

        Pizza piz3=AbstractFactory.getFactory("Dominos").createPizza("Carbonara");
        System.out.println(piz3);
        System.out.println();

        Pizza piz4=AbstractFactory.getFactory("Dominos").createPizza("Carbonara");
        System.out.println(piz4);
        System.out.println();

        Pizza piz5=AbstractFactory.getFactory("Dominos").createPizza("Carbonara");
        System.out.println(piz5);
        System.out.println();


    }
}
