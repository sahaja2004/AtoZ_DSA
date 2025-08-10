//if-else-else if practice
import java.util.*;
public class elseIf {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS:-");
        int marks=sc.nextInt();
        if (marks<25){
            System.out.println("GARDE-F");
        } else if (marks<=44) {
            System.out.println("GRADE-E");
        }else if(marks<=49){
            System.out.println("GRADE-D");
        }else if(marks<=59){
            System.out.println("GRADE-C");
        }else if(marks<=69){
            System.out.println("GRADE-B");
        }else if(marks>70){
            System.out.println("GRADE-A");
        }else{
            System.out.println("GRADE-X");
        }
    }
}
