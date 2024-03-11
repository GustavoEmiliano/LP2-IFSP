package br.com.emiliano;

import java.util.Scanner;
import java.io.IOException;

//notas consideradas são de 100, 50, 20, 10, 5, 2.

public class Notas_E_Moedas {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        //convertendo a variável valor, que é do tipo double, para o tipo int (inteiro).
        int valorInteiro = (int) valor;
        //calcula a parte decimal do valor fornecido.
        // Subtrai-se o valor inteiro do valor total para obter as casas decimais.
        // Multiplica por 100 para converter a parte decimal em centavos
        calculaNotas(valorInteiro);
        int parteDecimal = (int) ((valor - valorInteiro) * 100);
        calculaMoedas(parteDecimal);
    }

    public static int calculaNotas(int inteiroValor) {
        int[] notas = {100, 50, 20, 10, 5, 2};
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = inteiroValor / nota;
            inteiroValor %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
        }
        return inteiroValor;
    }
    public static Double calculaMoedas(double parteDecimal) {
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidade = (int) (parteDecimal / (moeda * 100));
            parteDecimal %= (int) (moeda * 100);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda);
        }
        return parteDecimal;
    }
}