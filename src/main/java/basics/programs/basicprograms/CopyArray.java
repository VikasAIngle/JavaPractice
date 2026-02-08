package basics.programs.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main( String args[]){
        
        copyArray();
        scanner.close();
    }
    
    //Java Program to copy all elements of one array into another array
    public static void copyArray(){
//        int[] arr = {1,2,3,4};
        
        System.out.println("Enter the number of array elements: \n");
        int n = scanner.nextInt();
        int arr[] =  new int[n];

        System.out.println("Enter array elements: \n");
        for (int i =0; i<n ; i++){
            arr[i] = scanner.nextInt();
        }
        
        int copyArr[] = new int[arr.length];
        
        for(int i=0; i< arr.length; i++){
            copyArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));
    }
    
}
