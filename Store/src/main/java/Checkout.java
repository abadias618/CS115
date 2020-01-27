/* Alberto Abdias Baldiviezo Aguilar
CS115-01
Assigment 3 desert shop
 */
import java.util.ArrayList;

public class Checkout {
    //list of objects of the class DessertItem
    ArrayList<DessertItem> list= new ArrayList<DessertItem>();
    //data initializer
    int numberOfItems=0;
    //getter n setter
    public int getNumberOfItems() {

        return numberOfItems;
    }
    public void setNumberOfItems(int numberOfItems) {

        this.numberOfItems = numberOfItems;
    }
    double totalCos=0.0;
    String rec="";
    double totalTx=0.0;
    //constructor
    public Checkout(){}
    //adds objects to the list and counts them in each calling of the method
    public void add(DessertItem x){
        list.add(x);
        int b=list.size();
        numberOfItems=b;
    }
    // iterates through the list and adds the cost of each object using their overriden methods of cost
    public double totalCost(){
        for (DessertItem i : list) {
            double csst=i.calculateItemCost();
            totalCos+=csst;
        }
        return totalCos;
    }
    //Overrides the default toString from java.object
    @Override
    public String toString( ) {
        for (DessertItem i : list) {
            String reciept=i.toString();
            rec+=reciept+"\n";
        }
        return rec;
    }
    public double totalTax(){
        for (DessertItem i : list) {
            double tx=i.findSalesTax();
            totalTx+=tx;
        }
        return totalTx;
    }

}

