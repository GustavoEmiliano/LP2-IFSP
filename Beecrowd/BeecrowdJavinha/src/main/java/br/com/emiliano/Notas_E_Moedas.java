package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;

//notas consideradas são de 100, 50, 20, 10, 5, 2.

public class Notas_E_Moedas {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        double valor = s.nextDouble();
        int valorInteiro = calculaInteiro(valor);
        int valorDecimal = calculaDecimal(valor, valorInteiro);
    }

    public static int calculaInteiro(double valor) {
        int parteInteira = (int) valor;
        int aux = parteInteira;

        int[] notas = {100, 50, 20, 10, 5, 2};
      
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = aux / nota;
            aux %= nota;
            System.out.printf("%d nota(s) de R$ %d.00%n", quantidade, nota);
        }

        return (parteInteira-aux);
    }

    public static int calculaDecimal(double valor, int valorInteiro) {
        int parteDecimal = (int) ((valor - valorInteiro) * 100);

        
        int[] moedas = {100, 50, 25, 10, 5, 1};
        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = parteDecimal / moeda;
            parteDecimal %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
        }
        return parteDecimal;
    }
}
