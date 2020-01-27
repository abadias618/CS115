import java.util.Arrays;

public class Algorithms_MergeSort {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7,11,0};
        /*
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={10,2,4,3,30,7,10};
        int[] intArray4={10,10,10,3,30,7,11};*/
        merge_sort(intArray,0,intArray.length);
        System.out.println(Arrays.toString(intArray));
        /*merge_sort(intArray2,0,intArray2.length);
        System.out.println(Arrays.toString(intArray2));
        merge_sort(intArray3,0,intArray3.length);
        System.out.println(Arrays.toString(intArray3));
        merge_sort(intArray4,0,intArray4.length);
        System.out.println(Arrays.toString(intArray4));*/
    }
    public static void merge(int[] a, int p, int q, int r){
        int pair=0;
        if(q==0)pair=1;
        int number_1=q-p+pair;
        int number_2=r-q;
        int[] left=new int[number_1];
        int[] right=new int[number_2];
        for (int i = 0; i < number_1; i++) {
            left[i]=a[p+i];
        }
        for (int i = 0; i < number_2 ; i++) {
            right[i]=a[q+i];
        }
        /*
        left[number_1+1]=100;
        right[number_2+1]=100;
        */
        int i=0;
        int j=0;
        for (int k = p; k < r; k++) {
            if(left[i]<=right[j]){
                a[k]=left[i];
                i=i+1;
            }
            else{
                a[k]=right[j];
                j=j+1;
            }
        }
    }
    public static void merge_sort(int[] a,int p, int r){
        if(p<r){
            int q=((p+r)/2);
            merge_sort(a,p,q);
            merge_sort(a,q+1,r);
            merge(a,p,q,r);
        }
        System.out.println(Arrays.toString(a));

    }
}
