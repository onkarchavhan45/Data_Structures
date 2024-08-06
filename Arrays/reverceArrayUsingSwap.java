import java.util.Arrays;
import java.util.Scanner;

public class reverceArrayUsingSwap {

    public static void main(String[] args) {
       System.out.println("hello code is working");
       Scanner in = new Scanner(System.in);
       int n=5;
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=in.nextInt();
       }
       System.out.println(Arrays.toString(arr));
       reverse(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2){
       int temp =arr[index1];
       arr[index1]=arr[index2];
       arr[index2]=temp;
    }
}


/*
java -cp /tmp/vsQDCLVn9h/reverceArrayUsingSwap
hello code is working
1
2
3
4
5
[1, 2, 3, 4, 5]
[5, 4, 3, 2, 1]

=== Code Execution Successful ===
*/

// reversing an array by swaping the numbers.