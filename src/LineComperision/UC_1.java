package LineComperision;

import java.util.Scanner;

public class UC_1 {
        public static void main(String[] args) {
            int Line;
            System.out.println("Welcome to Line\r\n"
                    + "Comparison Computation");
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the length of line X1");
            int x1=sc.nextInt();
            System.out.println("Enter the length of line X2");
            int x2=sc.nextInt();
            System.out.println("Enter the length of line Y1");
            int y1=sc.nextInt();
            System.out.println("Enter the length of line Y2");
            int y2=sc.nextInt();
            Line =( (x2-x1) ^ 2 + (y2- y1)^2);
            System.out.println(Line);



        }

        private static int sqrt(int i) {
            // TODO Auto-generated method stub
            return 0;
        }
}
