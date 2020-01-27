public class Sundae extends IceCream {
    String topping;
    double costTop;
    double tax;

    Sundae(String newType, double newCost, String newTopping, double newCostTop) {
        super(newType,newCost);
        topping = newTopping;
        costTop = newCostTop;
    }
    @Override
    public double calculateItemCost() {
        cost=cost+costTop;
        return cost;
    }
    @Override
    public String toString( ) {
        return "*"+type+","+cost+","+topping+","+costTop+"*";
    }
    @Override
    protected double findSalesTax() {
        tax=cost*0.05;
        return tax;
    }
}
