package Part1BootCampEasy;

import java.util.Random;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        int low,high;
        int n;
        int num;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println( "Please input first number :");
        low = scan.nextInt();
        System.out.println("Please input ending number :");
        high = scan.nextInt();
        System.out.println("Enter the no. of numbers you want to generate :");
        n = scan.nextInt();

        System.out.println("======================================");
        System.out.println("GENERATED Random Numbers");

        for(int i = 0; i<n; i++){
            num = rand.nextInt((high +1)-low) +low;
            System.out.println(num);

        }
    }
}





