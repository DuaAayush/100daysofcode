//////////////////////////////////////////////conditional statement//////////////////////////////////////////////////
///////////////////if else elseif////////////////////////////////////////
import java.util.*;
public class condstatement {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
        //if
    if(a>18){
        System.out.println("adult");
    }
        //else
    else{
        System.out.println("kiddoos");
    }
    int a= sc.nextInt();
    int b= sc.nextInt();
    if(a==b){
        System.out.println("a=b");
    }
        //else-if
    else if(a>b){
        System.out.println("a>b");
    }
    else{
        System.out.println("b>a");
    }
      ///////////////////switch////////////////////////////////
    int a=sc.nextInt();
    switch (a){
        case 1:System.out.println("hello");
        break;
        case 2:System.out.println("bonjour");
        break;
        case 3:System.out.println("namaste");
        break;
        default:System.out.println("bye");
    }
}
}
