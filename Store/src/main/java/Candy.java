public class Candy extends DessertItem {
    double quantity;
    double weight;
    String type;
    double cost;
    double tax;
    Candy(String newType,double newWeight, double newQuantity){
        type=newType;
        weight=newWeight;
        quantity=newQuantity;
    }
    @Override
    public double calculateItemCost() {
        cost=quantity*weight;
        return cost;
    }
    @Override
    public String toString( ) {
        return "*"+type+","+weight+","+quantity+"*";
    }

    @Override
    protected double findSalesTax() {
        tax=cost*0.05;
        return tax;
    }
}
