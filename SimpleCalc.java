import java.io.*;
import java.util.Scanner;
public class SimpleCalc{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("      LYNEX CALCULATOR");
        System.out.println("   choose your operation(*,/,+,-)");
        String operation= scanner.nextLine();
        System.out.println("you chose "+operation);
        switch (operation){
            case "*":
            System.out.println("Enter first number");
            int num1= scanner.nextInt();
            System.out.println("Enter second number");
            int num2= scanner.nextInt();
            int result= num1*num2;
            System.out.println("The result is: "+result);
            break;
            case "/":
            System.out.println("Enter first number");
            int num3= scanner.nextInt();
            System.out.println("Enter second number");
            int num4= scanner.nextInt();
            if(num4==0){
                System.out.print("dividion by 0 is not sciantifically correct!!");
            }
            else{
                int result2= num3/num4;
                System.out.println("The result is: "+result2);
            }
            break;
            case "+":
            System.out.println("Enter first number");
            int num5= scanner.nextInt();
            System.out.println("Enter second number");
            int num6= scanner.nextInt();
            int result3= num5+num6;
            System.out.println("The result is: "+result3);
            break;
            case "-":
            System.out.println("Enter first number");
            int num7=scanner.nextInt();
            System.out.println("Enter second number");
            int num8=scanner.nextInt();
            int result4=num7-num8;
            System.out.println("result is :"+result4);
            break;
            default:
            System.out.print("Please enter a valid operator");
            break;

        }
        scanner.close();
    }
}