package PizzaDeliver;

public class FactoryDominos extends AbstractFactory{

    static FactoryDominos factoryDominos = null;
    static int stock[];

    /*private FactoryDominos(){
        stock = new int[4];
        for (int i=0;i<4;i++){
            stock[i]=2;
        }
    }*/

    public static FactoryDominos getFactoryDominos(){
        if(factoryDominos==null){
            factoryDominos = new FactoryDominos();
            stock = new int[4];
            for (int i=0;i<4;i++){
                stock[i]=2;
            }
        }
        return factoryDominos;
    }

    /*public static int getStock() {
        return stock[1];
    }*/

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
