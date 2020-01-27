public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7,11};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={1,2,4,5,6,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        int[] intArray5={10,0,10,3,30,7,11};
        lSearch(intArray,30);
        lSearch(intArray2,4);
        lSearch(intArray3,100);
        lSearch(intArray4,0);
        lSearch(intArray5,0);
    }
    //searches through a array looking for an element, if it finds
    // it it breaks the loop to avoid vane iterations
    //if it doesn't find it and it is the last iteration it prints the
    //not found text.
    static void lSearch(int[] a, int b){
        for (int i = 0; i < a.length; i++) {

            if(a[i]==b){
                System.out.println(b+" found at index "+i);
                break;
            }
            else if(i==a.length-1){
                System.out.println(b+" not found anywhere in the list");
            }
        }
    }
}
