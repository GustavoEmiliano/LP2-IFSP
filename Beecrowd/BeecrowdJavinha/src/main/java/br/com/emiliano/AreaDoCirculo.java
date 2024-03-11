package br.com.emiliano;

import java.io.IOException;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        double raio = 0;
        raio = s.nextDouble();
        double pi = 3.14159;
        double area = calculaArea(pi, raio);
        System.out.printf("A=%.4f\n", area);
    }

    public static Double calculaArea(double pi, double raio) {
        double area = pi * (raio * raio);
        return area;
    }
}
