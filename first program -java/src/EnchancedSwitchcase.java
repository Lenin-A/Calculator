import java.util.Scanner;
public class EnchancedSwitchcase {
    public static void main(String[] args){
        System.out.println("Enter the number of day:");
        Scanner in = new Scanner(System.in);
        int Day = in.nextInt();
        switch(Day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}
