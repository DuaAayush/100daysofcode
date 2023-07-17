import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev = rev+A.charAt(i);
        }
        if(rev.equals(A))
         System.out.print("Yes");
         else
         System.out.print("No");
        
    }
}
