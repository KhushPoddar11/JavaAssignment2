package assignment2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of all array element is: "+sum(n,arr));
    }

    public static int sum(int n, int arr[])
    {
        int sum=0;
        for(int i = 0 ; i < n ; i++ ){
            sum = sum+arr[i];
        }
        return sum;
    }
}

/* Output:
    Enter the length of the array:
    4
    Enter array elements:
    10 10 10 10
    The sum of all array element is: 40
 */
