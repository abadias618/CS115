public abstract class DessertItem {

    public double calculateItemCost(){
        return 0.0;
    }
    //5% Sales tax
    protected abstract double findSalesTax();
}
