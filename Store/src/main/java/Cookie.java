public class Cookie extends DessertItem {
    double dozen;
    double quantity;
    String type;
    double cost;
    double tax;
    Cookie(String newType, double newQuantity, double newDozen){
        type=newType;
        quantity=newQuantity;
        dozen=newDozen;
    }
    @Override
    public double calculateItemCost(){
        cost=(quantity/12)*dozen;
        return cost;
    }
    @Override
    public String toString( ) {
        return "*"+type+","+quantity+","+dozen+"*";
    }
    @Override
    protected double findSalesTax() {
        tax=cost*0.05;
        return tax;
    }
}
