package PizzaDeliver;

public class FactoryHut extends AbstractFactory {

    static FactoryHut factoryHut = null;
    static int stock[];

    public static FactoryHut getFactoryHut(){
        if(factoryHut==null){
            factoryHut = new FactoryHut();
            stock = new int[4];
            for (int i=0;i<4;i++){
                stock[i]=2;
            }
        }
        return factoryHut;
    }

    @Override
    public Pizza createPizza(String name) {
        Pizza p;
        int i=5;
        if (name=="Margherita")
            i=0;
        if (name=="Prosciutto")
            i=1;
        if (name=="Frutti Di Mare")
            i=2;
        if (name=="Carbonara")
            i=3;

        if (stock[i]>0) {
            switch (name) {
                case "Margherita":
                    p = new Margherita();
                    stock[i]--;
                    break;

                case "Prosciutto":
                    p = new Prosciutto();
                    stock[i]--;
                    break;

                case "Frutti Di Mare":
                    p = new FruttiDiMare();
                    stock[i]--;
                    break;

                case "Carbonara":
                    p = new Carbonara();
                    stock[i]--;
                    break;
                default:
                    p = null;
            }
            return p;
        }
        else
            return null;
    }
}
