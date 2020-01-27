import java.util.Arrays;

public class Algorithms_BubbleSort {
    public static void bubble_sort(int[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = a.length-1; j==i+1 ;j--) {
                if(a[j]<a[j-1]){
                    int x=a[j];
                    a[j]=a[j-1];
                    a[j-1]=x;
                }

            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7,11,0};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={10,2,4,3,30,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        bubble_sort(intArray);
        bubble_sort(intArray2);
        bubble_sort(intArray3);
        bubble_sort(intArray4);
    }
}
