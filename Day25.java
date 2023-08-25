Problem 1: Simple Array Sum
Given an array of integers, find the sum of its elements

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        System.out.println(sum);
        scanner.close();
    }
}


          
