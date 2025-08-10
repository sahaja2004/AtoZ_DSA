//SWITCH-CASE PRACTICE PROBLEM
import java.util.*;
public class switchCaseDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7:-");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("PLEASE ENTER VALID NUMBERS IN THE RANGE(1-7)!!!!");
        }
    }
}
