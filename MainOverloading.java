public class MainOverloading {
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("this is running in main() without arguments");
        }else if(args.length==1){
            try{
                int value=Integer.parseInt(args[0]);
                main(value);
            } catch (NumberFormatException e) {
                main(args[0]);
            }
        }
    }
    public static void main(int value){
        System.out.println("value u enterd is "+value);
        System.out.println("This is running in main() with int argument");
    }
    public static void main(String s){
        System.out.println("String u entered is "+s);
        System.out.println("This is running in main() with string argument");
    }
}
