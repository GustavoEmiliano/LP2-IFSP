package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;
public class Multiplos {

    public static void main(String[] args) throws IOException{
        int A = 0;
        int B = 0;

        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        A = s.nextInt();
        verificaMultiplo(A, B);
    }

    public static void verificaMultiplo(int A, int B) {
        if (B % A == 0 || A % B == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
