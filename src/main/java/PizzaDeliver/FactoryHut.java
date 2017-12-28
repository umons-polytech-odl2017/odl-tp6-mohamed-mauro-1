package PizzaDeliver;

public class FactoryHut extends AbstractFactory {

    static FactoryHut factoryHut = null;

    public static FactoryHut getFactoryHut(){
        if(factoryHut==null){
            factoryHut = new FactoryHut();
        }
        return factoryHut;
    }

    @Override
    public Pizza createPizza(String name) {
        Pizza p;
        switch (name){
            case "Margherita":
                p=new MargheritaHut();
                break;

            case "Prosciutto":
                p=new ProsciuttoHut();
                break;

            case "Frutti Di Mare":
                p=new FruttiDiMareHut();
                break;

            case"Carbonara":
                p=new CarbonaraHut();
                break;
            default:
                p=null;
        }
        return p;
    }
}
