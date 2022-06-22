package assignment2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("The lowest element in the array: "+lowest(n,arr));
    }

    public static int lowest(int n, int arr[])
    {
        int min=arr[0];
        for(int i = 0 ; i < arr.length ; i++ ){
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }
}

/*
    Output:
    Enter the length of the array:
    5
    Enter array elements:
    1 2 3 4 5
    The lowest element in the array: 1
 */