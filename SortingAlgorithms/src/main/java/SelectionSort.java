import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7,11};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={1,2,4,5,6,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        int[] intArray5={10,0,10,3,30,7,11};
        sSort(intArray);
        System.out.println(Arrays.toString(intArray));
        sSort(intArray2);
        System.out.println(Arrays.toString(intArray2));
        sSort(intArray3);
        System.out.println(Arrays.toString(intArray3));
        sSort(intArray4);
        System.out.println(Arrays.toString(intArray4));
        sSort(intArray5);
        System.out.println(Arrays.toString(intArray5));
    }
    //Iterates through the array finding the smallest number at each iteration
    //then it swaps it with the first number of the array, it goes on to do the same thing again
    //but without looking anymore at the first number, so the second number in the second iteration becomes the first
    //in this way each time there is less data to iterate from.
    static void sSort(int[] a){
        int j=0;
        int transition=0;
        int index=0;
        int c=0;
        while(j<a.length-1){
            boolean condition=false;
            for (int k = c; k <a.length; k++) {
                int counter=0;
                for (int i = c; i < a.length; i++) {
                    if(a[k]<=a[i]){counter++;}
                }
                if(counter==a.length-j){
                    condition=true;
                    index=k;
                    break;
                }
            }

            if(condition==true){
                transition=a[j];
                a[j]=a[index];
                a[index]=transition;
                c++;
            }
            j++;
        }
    }
}
