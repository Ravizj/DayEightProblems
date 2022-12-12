package LineComperision;

import java.util.Scanner;

public class UC_2 {

        public static void main(String[] args) {
            System.out.println("Welcome to Line\r\n"
                    + "Comparison Computation");
            System.out.println("Enter the length of line");
            Scanner sc =new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==y) {
                System.out.println(x+" X equal to Y "+y);
            }
            else
                System.out.println(x+" X is not equal to Y  "+y);
        }
    }
