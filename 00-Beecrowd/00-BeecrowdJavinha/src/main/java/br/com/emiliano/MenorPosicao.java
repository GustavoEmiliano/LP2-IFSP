package br.com.emiliano;

import java.io.IOException;
import java.util.Scanner;

public class MenorPosicao {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] X = new int[N];

        // Lê os valores para o vetor X
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }
        verificaMenor(X);
    }

    public static void verificaMenor(int[] X) {
        int menorValor = X[0];
        int menorPosicao = 0;

        for (int i = 1; i < X.length; i++) {
            if (X[i] < menorValor) {
                menorValor = X[i];
                menorPosicao = i;
            }
        }

        // Exibe o menor valor e sua posição
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + menorPosicao);
    }
}
