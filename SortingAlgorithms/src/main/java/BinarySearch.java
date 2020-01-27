import java.util.Arrays;
//Need to figure out a way to distinguish two same numbers in the array
public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray={10,2,4,3,30,7};
        bSearch(intArray,10);
        bSearch(intArray,2);
        bSearch(intArray,4);
        bSearch(intArray,7);
        bSearch(intArray,3);
        bSearch(intArray,30);
        System.out.println(Arrays.toString(intArray));
        //
        int[] intArray2={10,9,10,7,6,5,0};
        bSearch(intArray2,10);
        bSearch(intArray2,10);
        bSearch(intArray2,5);
        bSearch(intArray2,6);
        bSearch(intArray2,7);
        bSearch(intArray2,0);
        bSearch(intArray2,9);
        System.out.println(Arrays.toString(intArray2));




    }

    static void bSearch(int[] a, int b){
        Arrays.sort(a);
        int arrayEnd=a.length-1;
        int arrayStart=0;
        int midNumber;
        int difference;
        while (arrayEnd!=1){
            difference=arrayEnd-arrayStart;
            if(arrayEnd%2==0){
                midNumber=(difference)/2;
            }
            else{ midNumber=((difference)+1)/2;}

            if(b<a[midNumber-1]){
                arrayEnd=midNumber;
            }
            else if(b>a[midNumber-1]){
                arrayEnd=midNumber+arrayEnd;
            }
            else {
                System.out.println("Number "+b+" found at index  "+(midNumber-1));
                break;
            }
        }

    }
}
