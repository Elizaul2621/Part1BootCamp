package Part1BootCampEasy;

import java.util.Scanner;

public class Question9 {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Input the first number :");
            int number1 = scan.nextInt();

            System.out.println("Enter the mathematical operation (+, -, *, /, dividebyzero)");
            String mathOperator = scan.next();

            System.out.println("Enter the second number :");
            int number2 = scan.nextInt();


            int result;

            switch (mathOperator) {
                case "+":
                    result = number1 + number2;
                    System.out.println("The sum of two numbers is : " + result);
                    break;

                case "-":
                    result = number1 - number2;
                    System.out.println("The difference of two numbers is :" + result);
                    break;

                case "*":
                    result = number1 * number2;
                    System.out.println("The multiplication sum of two numbers is : " + result);
                    break;

                case "/":
                    result = number1 / number2;
                    System.out.println("The division of two numbers is : " + result);
                    break;

                case "dividebyzero":


                default: System.out.println("number2 is zero so the result will be");

            }
        }
    }

