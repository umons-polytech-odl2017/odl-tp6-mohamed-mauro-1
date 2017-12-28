package PizzaDeliver;

public class FactoryDominos extends AbstractFactory{

    static FactoryDominos factoryDominos = null;

    public static FactoryDominos getFactoryDominos(){
        if(factoryDominos==null){
            factoryDominos = new FactoryDominos();
        }
        return factoryDominos;
    }


    @Override
    public Pizza createPizza(String name) {
        Pizza p;
        switch (name){
            case "Margherita":
                p=new Margherita();
                break;

            case "Prosciutto":
                p=new Prosciutto();
                break;

            case "Frutti Di Mare":
                p=new FruttiDiMare();
                break;

            case"Carbonara":
                p=new Carbonara();
                break;
            default:
                p=null;
        }
        return p;
    }
}
