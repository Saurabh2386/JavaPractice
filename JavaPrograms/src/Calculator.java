import java.util.Scanner;

public class Calculator {
    public static void calculator(){

        Scanner sc = new Scanner(System.in);
        char continueChoice;
        do {
            double num1, num2, result;
            char op;
            System.out.println("Calculator Operation");
            System.out.println("Input first number : ");
            num1 = sc.nextDouble();
            System.out.println("Select operator (+,-,*,/)");
            op = sc.next().charAt(0);
            System.out.println("Input second number");
            num2 = sc.nextDouble();

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result : " + result);
                    } else {
                        System.out.println("Error : Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid opreator! please use :-> +,_,*,/");
                    break;
            }
            System.out.println("do you want perform again calculator,press (y/n)");
            continueChoice   = sc.next().charAt(0);
        }
        while (continueChoice == 'y' || continueChoice == 'Y');
        System.out.println("Thank you for using the Calculator");
        sc.close();
    }
}
