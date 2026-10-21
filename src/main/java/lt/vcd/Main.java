package lt.vcd;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite auksti: ");
        int h = in.nextInt();
        System.out.print("Iveskite ploti: ");
        int w = in.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= w; k++) {
                if (i != 1 && i != h && k != 1 && k != w) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
