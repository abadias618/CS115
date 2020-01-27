public class IceCream extends DessertItem {
    String type;
    double cost;
    double tax;

    IceCream(String newType,double newCost){
        type=newType;
        cost=newCost;
    }

    @Override
    public double calculateItemCost() {
        return cost;
    }
    @Override
    public String toString( ) {
        return "*"+type+","+cost+"*";
    }
    @Override
    protected double findSalesTax() {
        tax=cost*0.05;
        return tax;
    }
}
