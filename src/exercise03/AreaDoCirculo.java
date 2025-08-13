package exercise03;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double n = 3.14159;
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);
    }
}
