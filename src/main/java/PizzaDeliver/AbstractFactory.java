package PizzaDeliver;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(String name)
    {
        switch(name)
        {
            case "Hut" :
            {
                return FactoryHut.getFactoryHut();
            }
            case "Dominos" :
            {
                return FactoryDominos.getFactoryDominos();
            }
            default:
                System.out.println("Nom incorrect");
        }
        return null;
    }


    public abstract Pizza createPizza(String name);
}
