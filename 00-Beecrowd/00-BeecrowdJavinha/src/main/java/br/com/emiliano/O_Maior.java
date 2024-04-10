package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;

public class O_Maior {
    public static void main(String []args) throws IOException {
        Scanner s = new Scanner(System.in);

        int A, B, C;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();

        int maiordeAB = maiorABC(A, B, C);
        System.out.println(maiordeAB + " eh o maior");
    }

    public static int maiorABC(int A, int B, int C) {
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        return (maiorAB + C + Math.abs(maiorAB - C)) / 2;
    }
}
