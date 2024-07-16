import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        System.out.println("Enter the fruit:");
        Scanner in = new Scanner(System.in);
        String Fruit = in.next();

        switch(Fruit){
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Orange":
                System.out.println("Sweet juicy Fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("not validate fruit");
        }
    }

}
