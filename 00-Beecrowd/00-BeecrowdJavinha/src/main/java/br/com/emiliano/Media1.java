package br.com.emiliano;

import java.io.IOException;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        double A;
        double B;
        double media = 0;

        A = s.nextDouble();
        B = s.nextDouble();

        media = CalculaMedia(A, B);
        System.out.printf("MEDIA = %.5f%n", media);
    }
    public static double CalculaMedia(double A, double B) {
        double mediaCalculada = ((A * 3.5) + (B * 7.5)) / 11;
        return mediaCalculada;
    }
}
