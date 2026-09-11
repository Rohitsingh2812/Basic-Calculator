import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("============ CALCULATOR ============");



            System.out.println("Enter your first number");
            double a = sc.nextDouble();

            System.out.println("Enter what operation you want to use");
            System.out.println("Addition: '+'");
            System.out.println("Subtraction: '-'");
            System.out.println("Multiplication: '*'");
            System.out.println("Division: '/'");
            System.out.println("Modulus: '%'");
            System.out.println("power: '^'");
            System.out.println("square root: 's'");
            System.out.println("nth root: 'n'");
            
            char operator = sc.next().charAt(0);
            
            double b = 0;
            if(operator != 's'){
            System.out.println("Enter your second number");
            b = sc.nextDouble();
            }
            switch (operator) {
                case '+':
                    System.out.println("Your number: " + (a + b));
                    break;
                case '-':
                    System.out.println("Your number: " + (a - b));
                    break;
                case '*':
                    System.out.println("Your number: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("denominater can't be zero");
                        break;
                    } else {
                        System.out.println("Your number: " + (a / b));
                        break;
                    }
                case '%':
                    if (b == 0) {
                        System.out.println("Cannot use modulo with zero");
                        break;
                    } else {
                        System.out.println("Your number: " + (a % b));
                        break;
                    }
                case '^':
                    System.out.println("Your number: " + Math.pow(a, b));
                    break;
                case 's':
                    if (a < 0) {
                        System.out.println("negative number not allowed");
                        break;
                    } else {
                        System.out.println("Your number: " + Math.sqrt(a));
                        break;
                    }
                case 'n':
                    if (b <= 0) {
                        System.out.println("root degree must be greater than zero!");
                        break;
                    } 
                    else if(a<0 && b%2 == 0){
                        System.out.println("even root of a negative number cause imaginary number!");
                        break;
                    }
                    else {
                        double result;
                        if(a<0){
                            result = -Math.pow(-a, 1.00/b);
                        }
                        else{
                            result = Math.pow(a, 1.00/b); 
                        }
                        System.out.println("Your number: " + result);
                        break;
                    }
                default:
                    System.out.println("Invalid operator");
            }

            System.out.println("If you want to exit press 'Y' or 'y' and not to exit press 'N' or 'n' ");
            char choice = sc.next().charAt(0);

            if (choice == 'Y'|| choice == 'y') {
                f = false;
            } else if (choice == 'N' || choice == 'n') {
                continue;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
