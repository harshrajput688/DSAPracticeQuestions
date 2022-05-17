/*
Shuffle the Array without using extra array
*/
import java.util.Arrays;

public class ShuffletheArrayUsingAnArray{
    public static void main(String[] args) {
        String []arrStr = {"a1","a2","a3", "a4", "b1","b2","b3","b4"};

        int []arrInt = {1,2,3,4,1,2,3,4};

        System.out.println("Integer Array Before Calling : "+ Arrays.toString(arrInt));

        setArray(arrInt);
        /*hii*/
        System.out.println("Integer Array After Calling" +Arrays.toString(arrInt));


        System.out.println("String Array Before Calling : "+ Arrays.toString(arrStr));

        setArray(arrStr);
        
        System.out.println("String Array After Calling" +Arrays.toString(arrStr));
    }
    static void setArray(int arr[]){
        int n = arr.length/2;

        for(int i = 1; i<n ;i++){
            int k = 0;
            for(int j = i; j<n ; j++){
                int temp = arr[j];
                arr[j] = arr[n+k];
                arr[n+k] = temp;
                k++;
            }
        }
    }
    static void setArray(String arr[]){
        int n = arr.length/2;

        for(int i = 1; i<n ;i++){
            int k = 0;
            for(int j = i; j<n ; j++){
                String temp = arr[j];
                arr[j] = arr[n+k];
                arr[n+k] = temp;
                k++;
            }
        }
    }
}
