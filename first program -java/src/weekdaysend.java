import java.util.Scanner;
public class weekdaysend {
    public static void main(String[] args){
        System.out.println("Enter the no of days:");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
        }
    }

}
