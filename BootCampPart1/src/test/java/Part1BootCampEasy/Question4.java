package Part1BootCampEasy;

import java.util.Scanner;

public class Question4 {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Input number :");
            int number = scan.nextInt();

            if(number %8==0 )
                System.out.println("This is an even number");
            else{
                System.out.println("This is an odd number");
            }
        }
    }

