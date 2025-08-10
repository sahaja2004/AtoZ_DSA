import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAMES:-");
        String[] names=new String[4];
        names[0]=sc.nextLine();
        names[1]=sc.nextLine();
        names[2]=sc.nextLine();
        names[3]=sc.nextLine();
        for(String i:names){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
