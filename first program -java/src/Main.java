//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ans = 0;
    while(true){
        System.out.print("ENTER THE OPERATOR:");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            System.out.println("Enter the number1");
            int num1 = in.nextInt();
            System.out.println("Enter the number");
            int num2 = in.nextInt();
            if(op == '+')
            {
                ans = num1 + num2;
            }if(op == '-')
            {
                ans = num1-num2;
            }if(op == '*')
            {
               ans = num1*num2;
            }if(op == '/')
            {
               if(num2!=0)
               {
                   ans = num1/num2;
               }
            }if(op == '%'){
                ans = num1%num2;
            }

        }else if(op == 'x' || op == 'X')
        {
            System.out.println("calculator mode is OFF");
            break;
        }else
        {
            System.out.println("The Invalid operator");
        }
        System.out.println("RESULT");
        System.out.println(ans);

    }

    }
}