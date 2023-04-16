package org.example;

import java.util.Scanner;

public class missingNumberArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array: ");
        for (int i=1; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing element: "+missingNumber(arr, size));
    }
    private static int missingNumber(int[] nums, int size){
        int output =0, sum=0;
        int sumOfArray = 0;
        sumOfArray = (size*(size+1))/2;
        for (int i=0; i<size;i++){
            sum += nums[i];
        }
        output = sumOfArray - sum;
        return output;
    }
}
