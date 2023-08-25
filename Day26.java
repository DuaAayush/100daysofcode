Problem 2: Compare the Triplets


import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }
        
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
        }
        
        System.out.println(aliceScore + " " + bobScore);
        scanner.close();
    }
}
  
