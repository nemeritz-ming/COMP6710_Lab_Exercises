package comp1110.lab2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        if (height == 1) {System.out.println("*");}
        else if (height == 2){System.out.println(" ".repeat(height-1)+"*"+"\n"+"*".repeat(3));}
        else {
            System.out.println(" ".repeat(height-1)+"*");
            for (int i = 1; i < height-1; i++) {
                System.out.println(" ".repeat(height - i - 1) + "*" + " ".repeat(2 * i - 1) + "*");
            }
            System.out.println("*".repeat(2*(height)-1));
        }
    }
}
