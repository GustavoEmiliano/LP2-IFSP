package br.com.emiliano;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSImples {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        int codigo1;
        int numeroPecas1;
        double valorpPeca1;
        int codigo2;
        int numeroPecas2;
        double valorPeca2;
        double total1 = 0;
        double total2 = 0;

        codigo1 = s.nextInt();
        numeroPecas1 = s.nextInt();
        valorpPeca1 = s.nextDouble();
        codigo2 = s.nextInt();
        numeroPecas2 = s.nextInt(); // Correção aqui
        valorPeca2 = s.nextDouble();

        total1 = calculaValor1(codigo1, numeroPecas1, valorpPeca1);
        total2 = calculaValor2(codigo2, numeroPecas2, valorPeca2);
        double total = calculaTotal(total1, total2); // Correção aqui
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }

    public static Double calculaValor1(int codigo1, int numeroPecas1, double valorPecas1) {
        double valor1 = numeroPecas1 * valorPecas1;
        return valor1;
    }

    public static Double calculaValor2(int codigo2, int numeroPecas2, double valorPecas2) {
        double valor2 = numeroPecas2 * valorPecas2;
        return valor2;
    }

    public static Double calculaTotal(double total1, double total2) {
        double total = total1 + total2;
        return total;

    }
}
