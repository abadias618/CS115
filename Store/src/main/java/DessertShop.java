/* Alberto Abdias Baldiviezo Aguilar
CS115-01
Assigment 4 desert shop with abstract class
 */
public class DessertShop {
    public static void main(String[] args) {

        Checkout checkout=new Checkout();//constructor
        //add items to the list
        checkout.add(new IceCream("Strawberry Ice Cream", 1.45));
        checkout.add(new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50));
        checkout.add (new Candy("Gummy Worms", 1.33, 0.89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 3.99));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 2.09));
        checkout.add (new Candy("Candy Corn", 3.0, 1.09));
        //data field from checkout class numberOfItems
        System.out.println("\nNumber of items: " + checkout.numberOfItems + "\n");
        //method that gets the total cost of the items through iteration in the list of objects
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        //prints total tax of all the items added to the Dessert Item List
        System.out.println("Total tax: " + checkout.totalTax() + "\n");
        //print the checkout object overriding the to String method modifying directly the object class from java
        System.out.println(checkout);
    }


}
