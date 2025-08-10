//if-else practice
import java.util.*;
public class ifElseDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:-");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("U R ADULT :(");
        }else{
            System.out.println("U R NOT AN ADULT :)");
        }
    }
}
