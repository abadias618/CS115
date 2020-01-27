import java.util.Arrays;

public class Algorithms_InsertSort {
    public static void main(String[] args) {
        int[] intArray={10,2,40,3,30,-7,11};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={10,2,4,0,30,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        insertionSort(intArray);
        insertionSort(intArray2);
        insertionSort(intArray3);
        insertionSort(intArray4);
    }
    public static void insertionSort(int[] a){
        int key;
        int j;
        //loops n-1 times through the array
        for (int i = 1; i < a.length; i++) {
            //selects the first element
            key=a[i];
            //selects 1 before the current key, that's why the loop starts in 1.
            j=i-1;
            //loops as long as the the element of the array isn't 0 and
            //as long as the a[j] is more than the key
            while (j>=0 && a[j]>key){
                //replaces the element to the right with a[j]
                a[j+1]=a[j];
                //looks to the next element on the left, if a[j] is larger thant he key
                j=j-1;
            }
            //the key is now the next element to a[j]
            a[j+1]=key;
        }
        System.out.println("Result "+ Arrays.toString(a)+"\n");
    }
}
