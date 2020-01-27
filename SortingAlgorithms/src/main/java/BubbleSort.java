import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7,11};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={10,2,4,3,30,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        bSort(intArray);
        System.out.println(Arrays.toString(intArray));
        bSort(intArray2);
        System.out.println(Arrays.toString(intArray2));
        bSort(intArray3);
        System.out.println(Arrays.toString(intArray3));
        bSort(intArray4);
        System.out.println(Arrays.toString(intArray4));

    }
    // it decides if a number is bigger than the next one on the array, if true
    //it swaps it, it does this the number of times the array length is-1
    // then it does it again until it doesn't swap any number because they are
    //all in order then the condition is false and it ends the loop.
    static void bSort(int[] a){
        boolean swaping;
        do{
            swaping=false;
            for (int i = 0; i <a.length-1 ; i++) {
                int var1=a[i];
                int transition=0;
                if(var1>a[i+1]&&i<a.length){
                    transition=var1;
                    a[i]=a[i+1];
                    a[i+1]=transition;
                    swaping=true;
                }
                else continue;
            }
        }while (swaping==true);

    }
}
