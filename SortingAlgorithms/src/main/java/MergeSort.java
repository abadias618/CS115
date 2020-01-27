import java.util.Arrays;
//merge sort using recursion
public class MergeSort {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7};
        int[] intArray2={10,9,8,7,6,5,4};
        int[] intArray3={1,2,4,5,6,7,10};
        int[] intArray4={10,10,10,3,30,7,11};
        int[] intArray5={10,0,10,3,30,7,11};
        System.out.println(Arrays.toString(mSort(intArray)));
        System.out.println(Arrays.toString(mSort(intArray2)));
        System.out.println(Arrays.toString(mSort(intArray3)));
        System.out.println(Arrays.toString(mSort(intArray4)));
        System.out.println(Arrays.toString(mSort(intArray5)));

    }
    /*@param takes the array to be sorted
      @returns result sorted array
    */
     static int[] mSort(int[] a){
        int arraylength=a.length;
        int[] left;
        int[] right;
        int[] resultArray;

        if(arraylength!=1){
            if (arraylength%2==0){
                left= new int[arraylength/2];
                right= new int[arraylength/2];
            }
            else {
                left= new int[arraylength/2];
                right= new int[arraylength/2+1];
            }
            for (int i = 0; i <arraylength ; i++) {
                if(i<(arraylength/2)){
                    left[i]=a[i];
                }
                else{
                    right[i-(arraylength/2)]=a[i];
                }
            }
            //recursion
            left=mSort(left);
            right=mSort(right);
            resultArray=merge(left,right);

        }
        else resultArray=a;



         return resultArray;
     }

    static int[] merge(int[] left, int[] right) {
        // create space for the merged array
        int[] result = new int[left.length+right.length];

        // running indices
        int i = 0;
        int j = 0;
        int index = 0;

        // add until one subarray is deplete
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];
            }
            else {
                    result[index++] = right[j++];
            }
        }

        // add every leftover element from the subarray
        while (i < left.length) {
            result[index++] = left[i++];
        }

        // only one of these two while loops will be executed
        while (j < right.length) {
            result[index++] = right[j++];
        }

        return result;
    }
}
